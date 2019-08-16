package com.projet3.library_webservice.library_webservice_service.response;

public class ResponseBody<T> {
	private T responseData;
	private String responseMessage;
	
	public Object getResponseData() {
		return responseData;
	}
	public void setResponseData(T responseData) {
		this.responseData = responseData;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}
