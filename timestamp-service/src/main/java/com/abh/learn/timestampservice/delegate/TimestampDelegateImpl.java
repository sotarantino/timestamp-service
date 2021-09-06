package com.abh.learn.timestampservice.delegate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Component;

import com.abh.learn.timestampservice.model.TimestampModel;

@Component
public class TimestampDelegateImpl implements TimestampDelegate {

	@Override
	public TimestampModel processTimestamp(String inputDate) {
		String unix;
		LocalDateTime utc;
		if (null != inputDate) {
			utc = LocalDateTime.parse(inputDate);
			unix = String.valueOf(utc.toInstant(ZoneOffset.UTC).getEpochSecond());
		}
		else {
			unix = String.valueOf(Instant.now().getEpochSecond());
			utc = LocalDateTime.now(ZoneOffset.UTC);
		}
		
		return new TimestampModel(unix, utc);
		
	}

}
