package com.projet3.library_webapp.library_webapp_business.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webapp.library_webapp_business.interfaces.BookingManager;
import com.projet3.library_webapp.library_webapp_consumer.DAO.BookingDAO;
import com.projet3.library_webapp.library_webapp_model.book.Booking;

public class BookingManagerImpl implements BookingManager {

	@Autowired
	private BookingDAO bookingDAO;
	
	public String createBooking(Integer userId, String bookTitle) {
		String response = bookingDAO.createBooking(userId, bookTitle);
		return response;
	}

	public Integer getBookingQuantity(String bookTitle) {
		Integer bookingQuantity = bookingDAO.getBookingQuantity(bookTitle);
		return bookingQuantity;
	}

	public Date getNextBookingReturn(String bookTitle) {
		Date nextReturn = bookingDAO.getNextBookingReturn(bookTitle).toGregorianCalendar().getTime();
		return nextReturn;
	}

	@Override
	public List<Booking> getBookingForUser(Integer userId) {
		List<Booking> bookingList = bookingDAO.getBookingForUser(userId);
		return bookingList;
	}

	@Override
	public void deleteBooking(String bookTitle, Integer userId) {
		bookingDAO.deleteBooking(bookTitle, userId);		
	}

	@Override
	public List<Booking> getAllBooking() {
		return bookingDAO.getAllBooking();
	}

	@Override
	public void addAlertDate(String bookTitle) {
		bookingDAO.addAlertDate(bookTitle);		
	}

}
