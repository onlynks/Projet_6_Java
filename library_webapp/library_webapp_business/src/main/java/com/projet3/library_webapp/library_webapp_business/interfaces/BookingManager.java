package com.projet3.library_webapp.library_webapp_business.interfaces;

import java.util.Date;
import java.util.List;

import com.projet3.library_webapp.library_webapp_model.book.Booking;

public interface BookingManager {
	public List<Booking> getAllBooking();
	public String createBooking(Integer userId, String bookTitle);
	public Integer getBookingQuantity(String bookTitle);
	public Date getNextBookingReturn(String bookTitle);
	public List<Booking> getBookingForUser(Integer userId);
	public void deleteBooking(String bookTitle, Integer userId);
	public void addAlertDate(String bookTitle);
	
}
