package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.projet3.library_webapp.library_webapp_model.book.Booking;

public interface BookingDAO {
	public List<Booking> getAllBooking();
	public String createBooking(Integer userId, String bookTitle);
	public Integer getBookingQuantity(String bookTitle);
	public XMLGregorianCalendar getNextBookingReturn(String bookTitle);	
	public List<Booking> getBookingForUser(Integer userId);
	public void deleteBooking(String bookTitle, Integer userId);
	public void addAlertDate(String bookTitle);
}
