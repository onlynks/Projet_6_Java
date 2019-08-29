package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import com.projet3.library_webservice.library_webservice_consumer.RowMapper.BookingRowMapper;
import com.projet3.library_webservice.library_webservice_model.beans.Booking;
import com.projet3.library_webservice.library_webservice_model.beans.User;

public class BookingDAOImpl extends AbstractDAO implements BookingDAO {
	
	@Override
	public Booking getBookingByTitleAndUser(String title, Integer userId) throws SQLException {
		String sql = "SELECT * FROM booking WHERE book_title = :title AND id_user = :userId";
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("title", title).addValue("userId", userId);
		
		Booking booking = namedParameterTemplate.queryForObject(sql, namedParameters, new BookingRowMapper());
		return booking;
	}

	@Override
	public List<Booking> getBookingListByTitle(String title) throws SQLException {
		String sql = "SELECT * FROM booking WHERE book_title = :title";
		SqlParameterSource namedParameters = new MapSqlParameterSource("title", title);
		
		List<Booking> booking = namedParameterTemplate.query(sql, namedParameters, new BookingRowMapper());
		return booking;
	}

	@Override
	public List<Booking> getBookingListByUser(Integer userId) throws SQLException {
		String sql = "SELECT * FROM booking WHERE id_user = :userId";
		SqlParameterSource namedParameters = new MapSqlParameterSource("userId", userId);
		
		List<Booking> booking = namedParameterTemplate.query(sql, namedParameters, new BookingRowMapper());
		return booking;
	}

	@Override
	public Integer getBookingNumber(String title) throws SQLException {
		String sql = "SELECT COUNT(*) FROM booking WHERE book_title = :bookTitle";
		SqlParameterSource namedParameters = new MapSqlParameterSource("bookTitle", title);
		
		Integer bookingNumber = namedParameterTemplate.queryForObject(sql, namedParameters, Integer.class);
		return bookingNumber;
	}

	@Override
	public void createBooking(Booking booking) throws SQLException {
		String sql = "INSERT INTO booking (book_title, id_user, position, alert_date) VALUES (:bookTitle, :userId, :position, :alertDate)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("bookTitle", booking.getBookTitle());
		params.addValue("userId", booking.getUserId());
		params.addValue("position", booking.getPosition());
		params.addValue("alertDate", booking.getAlertDate());
		
		namedParameterTemplate.update(sql, params);	
	}

	@Override
	public void deleteBooking(String bookTitle, User user) throws SQLException {
		String sql = "DELETE FROM booking WHERE book_title = :bookTitle AND id_user = :userId";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("bookTitle", bookTitle);
		params.addValue("userId", user.getId());
		
		namedParameterTemplate.update(sql, params);
	}

	@Override
	public Integer getBookingQuantity(String bookTitle) throws SQLException {
		String sql = "SELECT COUNT(*) FROM booking WHERE title = :title";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("title", bookTitle);
		
		return namedParameterTemplate.queryForObject(sql, params, Integer.class);	
	}

}
