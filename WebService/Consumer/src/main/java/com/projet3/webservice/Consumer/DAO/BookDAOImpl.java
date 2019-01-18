package com.projet3.webservice.Consumer.DAO;

import com.projet3.webservice.Consumer.RowMapper.BookRowMapper;
import com.projet3.webservice.Model.beans.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDAOImpl extends AbstractDAO implements BookDAO{

	@Override
	public Book getBook(String title) throws SQLException {
				
		String sql = "SELECT * FROM book WHERE title = ?";
		
		Book book = template.queryForObject(sql, new Object[] {title}, new BookRowMapper());
		
		return book;	
	}

	@Override
	public List<Book> getBookList() throws SQLException {

		String sql = "SELECT * FROM book";
		List<Book> bookList = new ArrayList<Book>();
		
		bookList = template.query(sql, new BookRowMapper());
		return bookList;
	}
	
	

}