package com.wpits.rightel.controller;
import java.io.IOException;
import java.util.*;
import java.util.stream.*;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wpits.rightel.beans.USSDResponse;
import com.wpits.rightel.service.UssdService;
import com.wpits.rightel.util.*;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

import java.util.function.*;

@RestController
@RequiredArgsConstructor
public class UssdController {

	private final UssdService service;
	
	private Map<String,Map<String,String>> map = new HashMap<String,Map<String,String>>();
	
	@GetMapping(value="menu/ussd",produces = "application/xml")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<?> menuUssd(
    		@RequestParam(required = true) String mobileNum,
    		@RequestParam(required = true) String action,
            @RequestParam(required = true) String message,
            @RequestParam(required = true) String sessionId
) {

		return service.menuUssd(mobileNum, action, message, sessionId,map);

    }
	
	
}
