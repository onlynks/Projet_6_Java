package com.projet3.library_webservice.library_webservice_consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.projet3.library_webservice.library_webservice_consumer.DAO.BookDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.UserDAO;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;

public class BorrowingRowMapper implements RowMapper<Borrowing>{

	private UserDAO userDAO;

	private BookDAO bookDAO;
	
	public BorrowingRowMapper(UserDAO user, BookDAO book) {
		userDAO = user;
		bookDAO = book;
	}
	@Override
	public Borrowing mapRow(ResultSet rs, int rowNum) throws SQLException {
		Borrowing borrowing = new Borrowing();
		
		borrowing.setId(rs.getInt("borrowing_id"));
		borrowing.setBeginningDate(rs.getDate("beginning_date"));
		borrowing.setEndingDate(rs.getDate("ending_date"));
		
		if(rs.getInt("book_id") != 0) {
			borrowing.setBook(bookDAO.getBookById(rs.getInt("book_id")));
		}
		if(rs.getInt("id_user") != 0) {
			borrowing.setUser(userDAO.getUserById(rs.getInt("id_user")));
		}		
 
        return borrowing;
	}

}
