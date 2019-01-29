package com.projet3.webservice.Consumer.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.projet3.webservice.Model.beans.Publisher;

public class PublisherRowMapper implements RowMapper<Publisher>{

	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Publisher publisher = new Publisher();
		
		publisher.setId(rs.getInt("publisher_id"));
		publisher.setName(rs.getString("name"));
		return publisher;
	}

}
