package com.projet3.library_webservice.library_webservice_business.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.Booking;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public interface BookingManager {
	
	public List<Booking> getBooking(Integer user) throws SQLException;
	public List<Booking> getBookingList(String bookTitle);
	public String createBooking(int userId, String bookTitle) throws SQLException;
}
