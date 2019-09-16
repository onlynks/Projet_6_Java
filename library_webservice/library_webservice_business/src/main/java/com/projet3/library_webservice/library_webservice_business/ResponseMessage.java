package com.projet3.library_webservice.library_webservice_business;

public enum ResponseMessage {
	NO_BOOK("01"),
	STILL_AVAILABLE("02"),
	ALREADY_BOOKED("03"),
	BOOKING_FULL("04");
	
	public String value;
	
	ResponseMessage(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
