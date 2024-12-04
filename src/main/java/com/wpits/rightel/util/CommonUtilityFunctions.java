package com.wpits.rightel.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wpits.rightel.beans.MapValue;

@Component
public class CommonUtilityFunctions {


	public String generateValidRequestParams(Map<String,Object> map) {
		String reqParams = "";
		Set<String> set = map.keySet();
		for(String key:set) {
			if(map.get(key)!=null) {
				reqParams = reqParams+"&"+key+"="+map.get(key).toString();
				//System.out.println(key+" : "+map.get(key).toString());
			}
		}
		return reqParams;
	}

	public String jsonToQuery(String operator,String json) {
		List list = extractDateRanges(operator,json);
		String whereDateRanges = "";
		JSONObject obj = null;
		if(list!=null && list.size()>0) {
			whereDateRanges = (String)list.get(0);
			obj = (JSONObject)list.get(1);			
		}

		if(obj!=null)
			json = obj.toJSONString();
		//json = json.replace(" ", "");
		String whereNotDate = "";		
		json = json.replace("{", "");
		json = json.replace("\"}", "'");
		json = json.replace("\":\"", "='");
		if(operator.equalsIgnoreCase("and")) {
			json = json.replace("\",\"", "' and ");	
		}
		else if(operator.equalsIgnoreCase("or")) {
			json = json.replace("\",\"", "' or ");			
		}
		json = json.replace("\":", "=");

		if(operator.equalsIgnoreCase("and")) {
			json = json.replace(",\"", " and ");
		}
		else if(operator.equalsIgnoreCase("or")) {
			json = json.replace(",\"", " or ");
		}
		json = json.replace("\"", "");
		json = json.replace("}", "");
		whereNotDate = json;


		if(whereNotDate.trim().length()==0) {
			whereDateRanges = whereDateRanges.replace(" and (", " (");
		}
		System.out.println("WHERENOTDATE :"+whereNotDate);
		System.out.println("WHEREDATE :"+whereDateRanges);

		return whereNotDate + whereDateRanges;
	}

	private List extractDateRanges(String operator,String json) {
		List list = new ArrayList();
		JSONObject obj = null;
		String result = " "+operator+" (";
		List<String> lsRemovedKeys = new ArrayList<String>();
		try {
			JSONParser parser = new JSONParser();
			obj = (JSONObject) parser.parse(json);
			Set<String> keys = obj.keySet();
			for(String key:keys) {
				String v = (String)obj.get(key).toString();

				if(v.contains("~")) {
					String vArr[]  =v.split("~");
					result = result+key+" between '"+vArr[0]+"' and '"+vArr[1]+"' "+operator+" ";
					lsRemovedKeys.add(key);
				}	
			}
			if(result.length()!=5 && result.length()!=6) {
				result = result+" )";
				result = result.replace(" and  )", ")");
				result = result.replace(" or  )", ")");
				list.add(result);
				for(String k:lsRemovedKeys) {
					obj.remove(k);
				}
				list.add(obj);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	public boolean checkDate(String strDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date dt = sdf.parse(strDate);
			String strDate2 = sdf.format(dt);
			if(strDate.equals(strDate2))
				return true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}


	public List<String> betweenDays(String from,String to) throws Exception{
		List<String> list = new ArrayList<String>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);

		String strTempFrom = from;
		String strTempTo=to;
		Calendar calendarTemp=Calendar.getInstance();

		while(!strTempFrom.equals(strTempTo)) {
			calendarTemp.setTime(sdf.parse(strTempFrom));

			calendarTemp.add(Calendar.DAY_OF_YEAR, 1);
			Date dt = calendarTemp.getTime();

			strTempFrom=sdf.format(dt);
			list.add(strTempFrom);
		}
		return list;
	}


	public  HashMap<String, Integer> sortMap(HashMap<String, Integer> hashMap) 
	{ 
		List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(hashMap.entrySet()); 
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
			public int compare(Map.Entry<String, Integer> o1,  
					Map.Entry<String, Integer> o2) 
			{ 

				return (o2.getValue()).compareTo(o1.getValue());
				//return (o1.getValue()).compareTo(o2.getValue()); 
			} 
		});
		HashMap<String, Integer> returnMap = new LinkedHashMap<String, Integer>(); 
		for (Map.Entry<String, Integer> map : list) { 
			returnMap.put(map.getKey(), map.getValue()); 
		} 
		return returnMap; 
	} 










	public long latency(long l_time_start) {
		long l_time_end = System.currentTimeMillis();
		long l_diff = l_time_end-l_time_start;
		return l_diff;

	}




public String getRandomNumber(int length) {
	Random rand = new Random();
	 String str = "1";
	 for(int i=1;i<=length;i++) {
		 str = str+"0";
	 }
	 int number = Integer.parseInt(str);
		String rand_number = String.format("%0"+length+"d", rand.nextInt(number));
return rand_number;		
}




public String getDate(Date dt,String pattern) {
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	String str = sdf.format(dt);
	return str;
	
}


public static Map getMap() {
	Map<String,MapValue> map = new HashMap<String,MapValue>();
	
	
	
	return null;
}

}
