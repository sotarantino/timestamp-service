package com.abh.learn.timestampservice.controller;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abh.learn.timestampservice.delegate.TimestampDelegate;
import com.abh.learn.timestampservice.model.TimestampModel;

@RestController
public class TimestampController {
	
	@Autowired
	TimestampDelegate tsd;
	// Sample Requests
	// 1. http://localhost:8090/api/v1/date/2021-09-04T10:15:30
	// 2. http://localhost:8090/api/v1/date
	
	@GetMapping({"/api/v1/date", "/api/v1/date/{date}"})
	public TimestampModel fetchTimestamp(@PathVariable("date") Optional<String> inputDate) {
		
		
		//TODO - Input Validation
		//TODO - Exception Handling
		//TODO - JUnits
		String inDate = null;
		if (!inputDate.isEmpty()) {
			inDate = inputDate.get();
		}
		return tsd.processTimestamp(inDate);
	}

}
