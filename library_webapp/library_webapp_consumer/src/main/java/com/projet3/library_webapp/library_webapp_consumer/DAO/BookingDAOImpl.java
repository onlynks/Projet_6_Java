package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.projet3.library_webapp.library_webapp_model.book.Booking;

public class BookingDAOImpl extends AbstractBookDAO implements BookingDAO {

	@Override
	public List<Booking> getAllBooking() {
		List<Booking> bookingList = bookServiceConnection.getAllBooking();
		return bookingList;
	}
	
	public String createBooking(Integer userId, String bookTitle) {
		String response = bookServiceConnection.createBooking(userId, bookTitle);
		return response;
	}

	public Integer getBookingQuantity(String bookTitle) {
		Integer bookingQuantity = bookServiceConnection.getBookingQuantity(bookTitle);
		return bookingQuantity;
	}

	public XMLGregorianCalendar getNextBookingReturn(String bookTitle) {
		XMLGregorianCalendar nextReturn = bookServiceConnection.getNextBookReturn(bookTitle);
		return nextReturn;
	}

	@Override
	public List<Booking> getBookingForUser(Integer userId) {
		List<Booking> bookingList = bookServiceConnection.getBookingForUser(userId);
		return bookingList;
	}

	@Override
	public void deleteBooking(String bookTitle, Integer userId) {
		bookServiceConnection.deleteBooking(bookTitle, userId);		
	}

	@Override
	public void addAlertDate(String bookTitle) {
		bookServiceConnection.addAlertDate(bookTitle);
		
	}

}
