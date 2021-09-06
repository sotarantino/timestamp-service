package com.abh.learn.timestampservice.delegate;

import org.springframework.stereotype.Component;

import com.abh.learn.timestampservice.model.TimestampModel;

@Component
public interface TimestampDelegate {
	
	public TimestampModel processTimestamp(String inputDate);

}
