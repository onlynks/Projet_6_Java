package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.projet3.webservice.Consumer.RowMapper.BookRowMapper;
import com.projet3.webservice.Consumer.RowMapper.PublisherRowMapper;
import com.projet3.webservice.Model.beans.Book;
import com.projet3.webservice.Model.beans.Publisher;

public class PublisherDAOImpl extends AbstractDAO implements PublisherDAO {

	@Override
	public Publisher getPublisherByID(int id) throws SQLException {
		String sql = "SELECT * FROM publisher WHERE publisher_id = :id";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", id);
		
		Publisher publisher = namedParameterTemplate.queryForObject(sql, namedParameters, new PublisherRowMapper());
		
		return publisher;
	}

	@Override
	public List<Publisher> getPublisherList() throws SQLException {
		String sql = "SELECT * FROM publisher";
		List<Publisher> publisherList = new ArrayList<Publisher>();
		
		publisherList = template.query(sql, new PublisherRowMapper());
		return publisherList;
	}

	@Override
	public void createPublisher(Publisher publisher) throws SQLException {
		String sql = "INSERT INTO publisher (name) VALUES (:name)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", publisher.getName());
		
		namedParameterTemplate.update(sql, params);	
		
	}

	@Override
	public void updatePublisher(Publisher publisher) throws SQLException {
		String sql = "UPDATE publisher SET name = :name WHERE publisher_id = :publisher_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("publisher_id", publisher.getId());
		params.addValue("name", publisher.getName());
		
		namedParameterTemplate.update(sql, params);	
		
	}

	@Override
	public void deletePublisher(Publisher publisher) throws SQLException {
		String sql = "DELETE FROM publisher WHERE publisher_id = :publisher_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("publisher_id", publisher.getId());
		
		namedParameterTemplate.update(sql, params);
		
	}

}
