package com.projet3.webservice.Consumer.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.projet3.webservice.Model.beans.Author;

public class AuthorRowMapper implements RowMapper<Author>{

	@Override
	public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
		Author author = new Author();
		
		author.setId(rs.getInt("author_id"));
		author.setFirstName(rs.getString("first_name"));
		author.setLastName(rs.getString("last_name"));
		author.setBirthDate(rs.getDate("birth_date"));
		author.setDeathDate(rs.getDate("death_date"));
		author.setDescription(rs.getString("description"));
		
		return author;
	}

}
