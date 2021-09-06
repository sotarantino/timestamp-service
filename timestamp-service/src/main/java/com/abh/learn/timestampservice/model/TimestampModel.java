package com.abh.learn.timestampservice.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
public class TimestampModel {
	
	private String currentDate;
	private LocalDateTime utc;
	private long currentNanos;
	
	public TimestampModel(String unix, LocalDateTime utc) {
		super();
		this.currentDate = unix;
		this.utc = utc;
		this.currentNanos = getCurrentNanos();
	}

	public String getUnix() {
		return currentDate;
	}

	public void setUnix(String unix) {
		this.currentDate = unix;
	}

	public LocalDateTime getUtc() {
		return utc;
	}

	public void setUtc(LocalDateTime utc) {
		this.utc = utc;
		
	}

	@Override
	public String toString() {
		return "TimestampModel [unix=" + currentDate + ", utc=" + utc + "]";
	}

	public long getCurrentNanos() {
		return System.nanoTime();
	}

	

	
	
	

}
