package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.Booking;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public interface BookingDAO {

	public Booking getBookingByTitleAndUser(String title, Integer userId) throws SQLException;
	public List<Booking> getBookingListByTitle(String title) throws SQLException;
	public List<Booking> getBookingListByUser(Integer userId) throws SQLException;
	public Integer getBookingNumber(String title) throws SQLException;
	public void createBooking(Booking booking) throws SQLException;
	public void deleteBooking(String bookTitle, User user) throws SQLException;
}