package com.projet3.library_webservice.library_webservice_consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

import com.projet3.library_webservice.library_webservice_consumer.DAO.AuthorDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.PublisherDAO;
import com.projet3.library_webservice.library_webservice_model.beans.Book;

public class BookRowMapper implements RowMapper<Book>{
	
	private AuthorDAO authorDAO;

	private PublisherDAO publisherDAO;
	
	public BookRowMapper(AuthorDAO author, PublisherDAO publisher) {
		authorDAO = author;
		publisherDAO = publisher;
	}
	
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		
		book.setId(rs.getInt("book_id"));
		book.setTitle(rs.getString("title"));
		book.setDescription(rs.getString("description"));
		book.setAvailable(rs.getBoolean("available"));
		
		if(rs.getInt("author_id") != 0) {
			book.setAuthor(authorDAO.getAuthorByID(rs.getInt("author_id")));
		}
		if(rs.getInt("publisher_id") != 0) {
			book.setPublisher(publisherDAO.getPublisherByID(rs.getInt("publisher_id")));
		}		
 
        return book;
	}

}
