package com.projet3.webservice.Consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.projet3.webservice.Model.beans.Book;

public class BookRowMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		
		book.setId(rs.getInt("book_id"));
		book.setTitle(rs.getString("book_title"));
		book.setDescription(rs.getString("book_description"));
 
        return book;
	}

}
