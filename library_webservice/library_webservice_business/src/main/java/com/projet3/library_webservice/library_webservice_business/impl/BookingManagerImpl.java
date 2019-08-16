package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

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
	public String createBooking(int userId, String bookTitle) throws SQLException {
		List<Book> matchingBooks = bookDAO.bookResearch(bookTitle);
		
		if ( matchingBooks == null ) {
			return "Ce livre n'existe pas";
		}		
		Boolean hasAvailableBook = matchingBooks.stream().anyMatch( book -> book.getAvailable());		
		
		if ( hasAvailableBook ) {
			return "Ce livre est déjà disponible";
		}
		List<Booking> bookingList = bookingDAO.getBookingListByTitle(bookTitle);
			
		if ( bookingList.size() >= matchingBooks.size() * 2 ) {
			return "Le nombre de réservation maximum a été atteint pour ce livre";
		}
		int lastPosition = bookingList.stream().reduce((booking1, booking2) ->
			booking1.getPosition() > booking2.getPosition()? booking1: booking2
			).get().getPosition();
		
		Booking booking = new Booking(null, bookTitle, userId, lastPosition + 1, null);
		
		bookingDAO.createBooking(booking);
		return null;
	}
	
	

}
