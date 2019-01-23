package com.projet3.webservice.Consumer.DAO;

import com.projet3.webservice.Consumer.RowMapper.BookRowMapper;
import com.projet3.webservice.Model.beans.Book;
import com.projet3.webservice.Model.beans.Publisher;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class BookDAOImpl extends AbstractDAO implements BookDAO{

	@Override
	public Book getBook(String title) throws SQLException {
				
		//String sql = "SELECT * FROM book WHERE title = ?";
		String sql = "SELECT * FROM book WHERE title = :title";
		SqlParameterSource namedParameters = new MapSqlParameterSource("title", title);
        
		//Book book = template.queryForObject(sql, new Object[] {title}, new BookRowMapper());
		Book book = namedParameterTemplate.queryForObject(sql, namedParameters, new BookRowMapper());
		
		return book;	
	}

	@Override
	public List<Book> getBookList() throws SQLException {

		String sql = "SELECT * FROM book";
		List<Book> bookList = new ArrayList<Book>();
		
		bookList = template.query(sql, new BookRowMapper());
		return bookList;
	}

	@Override
	public List<Book> bookResearch(String title) throws SQLException {

		String sql = "SELECT * FROM book WHERE title LIKE :title";
		SqlParameterSource namedParameters = new MapSqlParameterSource("title", "%"+title+"%");
		List<Book> bookFound = new ArrayList<Book>();
		
		bookFound = namedParameterTemplate.query(sql, namedParameters, new BookRowMapper());
		
		return bookFound;
	}

	@Override
	public void createBook(Book book) {
		String sql = "INSERT INTO book (title, description, quantity, max_quantity) VALUES (:title, :description, :quantity, :max_quantity)";
		//String sql = "INSERT INTO book (title, description, quantity, max_quantity) VALUES (?, ?, ?, ?)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("title", book.getTitle());
		params.addValue("description", book.getDescription());
		params.addValue("quantity", book.getQuantity());
		params.addValue("max_quantity", book.getMaxQuantity());
		
		namedParameterTemplate.update(sql, params);
		
		//template.update("INSERT INTO publisher (name) VALUES (?)", "Natan");
		//template.update(sql, book.getTitle(), book.getDescription(), book.getQuantity(), book.getMaxQuantity());		
	}
	
	public int test(Book book) {
		String sql = "INSERT INTO book (title, description, quantity, max_quantity) VALUES (:title, :description, :quantity, :max_quantity)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("title", book.getTitle());
		params.addValue("description", book.getDescription());
		params.addValue("quantity", book.getQuantity());
		params.addValue("max_quantity", book.getMaxQuantity());
		
		return namedParameterTemplate.update(sql, params);
	}
	
	

}