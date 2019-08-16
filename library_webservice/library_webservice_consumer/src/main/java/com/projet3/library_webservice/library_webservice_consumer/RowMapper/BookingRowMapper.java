package com.projet3.library_webservice.library_webservice_consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.projet3.library_webservice.library_webservice_model.beans.Booking;

public class BookingRowMapper implements RowMapper<Booking>{

	@Override
	public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		Booking booking = new Booking();
		
		booking.setBookingId(rs.getInt("booking_id"));
		booking.setBookTitle(rs.getString("book_title"));
		booking.setUserId(rs.getInt("id_user"));
		booking.setPosition(rs.getInt("position"));
		booking.setAlertDate(rs.getDate("alert_date"));
		
		return booking;
	}

}
