package com.projet3.webservice.Consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.projet3.webservice.Consumer.DAO.AuthorDAO;
import com.projet3.webservice.Consumer.DAO.PublisherDAO;
import com.projet3.webservice.Model.beans.Book;

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
		book.setQuantity(rs.getInt("quantity"));
		book.setMaxQuantity(rs.getInt("max_quantity"));
		
		if(rs.getInt("author_id") != 0) {
			book.setAuthor(authorDAO.getAuthorByID(rs.getInt("author_id")));
		}
		if(rs.getInt("publisher_id") != 0) {
			book.setPublisher(publisherDAO.getPublisherByID(rs.getInt("publisher_id")));
		}		
 
        return book;
	}

}
