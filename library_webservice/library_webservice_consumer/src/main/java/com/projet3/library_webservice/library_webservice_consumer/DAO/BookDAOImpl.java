package com.projet3.library_webservice.library_webservice_consumer.DAO;

import com.projet3.library_webservice.library_webservice_consumer.RowMapper.BookRowMapper;
import com.projet3.library_webservice.library_webservice_model.beans.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class BookDAOImpl extends AbstractDAO implements BookDAO{

	@Autowired
	private AuthorDAO authorDAO;
	
	@Autowired
	private PublisherDAO publisherDAO;
	
	@Override
	public List<Book> getBookByTitle(String title) throws SQLException {

		String sql = "SELECT * FROM book WHERE title = :title";
		SqlParameterSource namedParameters = new MapSqlParameterSource("title", title);
        
		List<Book> bookList = namedParameterTemplate.query(sql, namedParameters, new BookRowMapper(authorDAO, publisherDAO));		
		return bookList;	
	}
	
	@Override
	public Book getBookById(int id) throws SQLException {
		
		String sql = "SELECT * FROM book WHERE book_id = :book_id";
		SqlParameterSource namedParameters = new MapSqlParameterSource("book_id", id);
        
		Book book = namedParameterTemplate.queryForObject(sql, namedParameters, new BookRowMapper(authorDAO, publisherDAO));		
		return book;
	}

	@Override
	public List<Book> getBookList() throws SQLException {

		String sql = "SELECT * FROM book";
		List<Book> bookList = new ArrayList<Book>();
		
		bookList = template.query(sql, new BookRowMapper(authorDAO, publisherDAO));
		return bookList;
	}

	@Override
	public List<Book> bookResearch(String title) throws SQLException {

		String sql = "SELECT * FROM book WHERE title LIKE :title";
		SqlParameterSource namedParameters = new MapSqlParameterSource("title", "%"+title+"%");
		List<Book> bookFound = new ArrayList<Book>();
		
		bookFound = namedParameterTemplate.query(sql, namedParameters, new BookRowMapper(authorDAO, publisherDAO));
		
		return bookFound;
	}

	@Override
	public void createBook(Book book) {
		String sql = "INSERT INTO book (title, description, available, author_id, publisher_id) VALUES (:title, :description, :available, :author_id, :publisher_id)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("title", book.getTitle());
		params.addValue("description", book.getDescription());
		params.addValue("available", book.getAvailable());
		params.addValue("author_id", book.getAuthor().getId());
		params.addValue("publisher_id", book.getPublisher().getId());
		
		namedParameterTemplate.update(sql, params);	
	}

	@Override
	public void updateBook(Book book) throws SQLException {
		String sql = "UPDATE book SET title = :title, description = :description, available = :available, author_id = :author_id, publisher_id = :publisher_id WHERE book_id = :book_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("book_id", book.getId());
		params.addValue("title", book.getTitle());
		params.addValue("description", book.getDescription());
		params.addValue("available", book.getAvailable());
		params.addValue("author_id", book.getAuthor().getId());
		params.addValue("publisher_id", book.getPublisher().getId());
		
		namedParameterTemplate.update(sql, params);		
	}

	@Override
	public void deleteBook(Book book) throws SQLException {
		String sql = "DELETE FROM book WHERE book_id = :book_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("book_id", book.getId());
		
		namedParameterTemplate.update(sql, params);
		
	}

	@Override
	public int countBook(String title) throws SQLException {
		String sql = "SELECT COUNT(*) FROM book WHERE title = :title AND available = 1";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("title", title);
		
		return namedParameterTemplate.queryForObject(sql, params, Integer.class);
	}
	
	

}