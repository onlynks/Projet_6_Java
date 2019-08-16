package com.projet3.library_webservice.library_webservice_model.beans;

import java.util.Date;

public class Booking {
	
	private Integer bookingId;
	private String bookTitle;
	private Integer userId;
	private Integer position;
	private Date alertDate;
	
	public Booking(Integer bookingId, String bookTitle, Integer userId, Integer position, Date alertDate) {
		this.bookingId = bookingId;
		this.bookTitle = bookTitle;
		this.userId = userId;
		this.position = position;
		this.alertDate = alertDate;
	}
	
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getPosition() {
		return position;
	}
	public void setPosition(Integer position) {
		this.position = position;
	}
	public Date getAlertDate() {
		return alertDate;
	}
	public void setAlertDate(Date alertDate) {
		this.alertDate = alertDate;
	}

}
