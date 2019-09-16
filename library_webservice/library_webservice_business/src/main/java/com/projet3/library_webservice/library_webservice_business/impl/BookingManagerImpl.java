package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webservice.library_webservice_business.ResponseMessage;
import com.projet3.library_webservice.library_webservice_business.interfaces.BookingManager;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookingDAO;
import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Booking;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public class BookingManagerImpl implements BookingManager {
	
	@Autowired
	private BookingDAO bookingDAO;
	@Autowired
	private BookDAO bookDAO;

	@Override
	public List<Booking> getBookingList() throws SQLException {
		return bookingDAO.getAllBooking();
	}
	
	@Override
	public List<Booking> getBooking(Integer userId) throws SQLException {
		List<Booking> booking = bookingDAO.getBookingListByUser(userId);

		return booking;
	}

	@Override
	public List<Booking> getBookingList(String bookTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createBooking(int userId, String bookTitle) throws Exception {
		List<Book> matchingBooks = bookDAO.bookResearch(bookTitle);
		
		if ( matchingBooks.isEmpty() ) {
			throw new Exception(ResponseMessage.NO_BOOK.value);
		}		
		Boolean hasAvailableBook = matchingBooks.stream().anyMatch( book -> book.getAvailable());		
		
		if ( hasAvailableBook ) {
			throw new Exception(ResponseMessage.STILL_AVAILABLE.value);
		}
		
		List<Booking> bookingList = bookingDAO.getBookingListByTitle(bookTitle);
		Boolean alreadyBooked = bookingList.stream().anyMatch( booking -> booking.getUserId() == userId);
		
		if ( alreadyBooked ) {
			throw new Exception(ResponseMessage.ALREADY_BOOKED.value);
		}
		
		if ( bookingList.size() >= matchingBooks.size() * 2 ) {
			throw new Exception(ResponseMessage.BOOKING_FULL.value);
		}		
		int lastPosition;
		
		if ( bookingList.size() == 0 ) {
			lastPosition = 0;
		} else {
			lastPosition = bookingList.stream().reduce((booking1, booking2) ->
			booking1.getPosition() > booking2.getPosition()? booking1: booking2
			).get().getPosition();
		}		
		
		Booking booking = new Booking(null, bookTitle, userId, lastPosition + 1, null);		
		bookingDAO.createBooking(booking);
	}

	@Override
	public Integer getBookingQuantity(String bookTitle) throws Exception {
		return bookingDAO.getBookingNumber(bookTitle);
	}

	@Override
	public void deleteBooking(String bookTitle, Integer userId) throws Exception {
		bookingDAO.deleteBooking(bookTitle, userId);
		updateBooking(bookTitle);		
	}

	@Override
	public void updateBooking(String bookTitle) throws Exception {
		List<Booking> bookingList = bookingDAO.getBookingListByTitle(bookTitle);		
		bookingList.sort(Comparator.comparing(Booking::getPosition));
		
		for (int index = 0; index < bookingList.size(); index ++ ) {			
			bookingList.get(index).setPosition(index + 1);
			bookingDAO.updateBooking(bookingList.get(index));
		}
	}

	

}
