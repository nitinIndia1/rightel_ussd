package com.wpits.rightel.service;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.*;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.wpits.rightel.beans.USSDResponse;
import com.wpits.rightel.util.*;
import com.wpits.rightel.util.CustomResponseEnum;

import lombok.RequiredArgsConstructor;

import java.util.function.*;
@Service
@RequiredArgsConstructor
public class UssdService {

	private final CurrentService curService;
	private final NextService nextService;
	
	
	
	
	public ResponseEntity<?> menuUssd(String msisdn,String action,String message,String sessionId,Map<String,Map<String,String>> map){
		USSDResponse xml = new USSDResponse(); 
		 
		
		Map<String,String> subMap =  map.get(msisdn);
		
		if(subMap==null) {
			map= begin(msisdn,map);
			subMap =  map.get(msisdn);
			String strCur = subMap.get("cur");
			String[] arr = curService.getCurrent(strCur,msisdn,map);
//			String strEncText = null;
//			try {
//				strEncText = URLEncoder.encode(arr[0], StandardCharsets.UTF_8.toString());
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			}
			 xml = new USSDResponse(); 
			  xml.setAction(arr[1]);
			  xml.setPhone(msisdn); 
			  xml.setSessionId(sessionId);
			  xml.setText(arr[0]); 
			  xml.setErrorCode("0"); 
			  xml.setCodeSchema("1");
			  xml.setServiceId("");

				HttpHeaders headers = new HttpHeaders();
			//	headers.setContentType(MediaType.APPLICATION_XML);
		        ResponseEntity<?> entityModel
		            = new ResponseEntity<>(xml, headers,
		                                   HttpStatus.CREATED);
		 
		        return entityModel;
			
		}
		
		
		 
	
		String next = subMap.get("next");
		map = nextService.getNextService(msisdn, next, message, map);
		
		subMap =  map.get(msisdn);
		if(subMap!=null) {
		String strCur = subMap.get("cur");
		String[] arr = curService.getCurrent(strCur,msisdn,map);
//		String strEncText = null;
//		try {
//			strEncText = URLEncoder.encode(arr[0], StandardCharsets.UTF_8.toString());
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		 xml = new USSDResponse(); 
		  xml.setAction(arr[1]);
		  xml.setPhone(msisdn); 
		  xml.setSessionId(sessionId);
		  xml.setText(arr[0]); 
		  xml.setErrorCode("0"); 
		  xml.setCodeSchema("1");
		  xml.setServiceId("");

			HttpHeaders headers = new HttpHeaders();
		//	headers.setContentType(MediaType.APPLICATION_XML);
	        ResponseEntity<?> entityModel
	            = new ResponseEntity<>(xml, headers,
	                                   HttpStatus.CREATED);
	 
	        return entityModel;
		}else {
			ResponseEntity<?> entityModel = new ResponseEntity<>("flow ended!",null,HttpStatus.BAD_REQUEST);
			return entityModel;
		}
		
	}
	
	
	private Map<String,Map<String,String>> begin(String msisdn,Map<String,Map<String,String>> map) {
		Map<String,String> subMap= new HashMap<String,String>();
		subMap.put("cur", "languageSelectDisp");
		subMap.put("next","languageSelectInput");
		subMap.put("previous", null);
		map.put(msisdn, subMap);
		return map;
	}
	
	
	
	
	public static Document stringToXml(String strXml)
			  throws ParserConfigurationException {
			    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			    DocumentBuilder builder = factory.newDocumentBuilder();
			    String xmlString = strXml;
			    InputSource is = new InputSource(new StringReader(xmlString));
			    Document xmlDoc = null;
			    try {
			        xmlDoc = builder.parse(is);
			    } catch (SAXException e) {
			        throw new RuntimeException(e);
			    } catch (IOException e) {
			        throw new RuntimeException(e);
			    }
			    return xmlDoc;
	}
	
	
}
