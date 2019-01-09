package com.projet3.webservice.Consumer.DAO;

import com.projet3.webservice.Consumer.RowMapper.BookRowMapper;
import com.projet3.webservice.Model.beans.Book;
import java.sql.*;
import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOImpl extends AbstractDAO implements BookDAO{

	@Override
	public Book getBook(String title) throws SQLException {
				
		String sql = "SELECT * FROM book WHERE book_title = ?";
		
		Book book = template.queryForObject(sql, new Object[] {title}, new BookRowMapper());
		
		return book;		
		
	}
	
	

}