package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.projet3.library_webservice.library_webservice_consumer.RowMapper.AuthorRowMapper;
import com.projet3.library_webservice.library_webservice_model.beans.Author;

public class AuthorDAOImpl extends AbstractDAO implements AuthorDAO {

	@Override
	public Author getAuthorByID(int id) throws SQLException {
		String sql = "SELECT * FROM author WHERE author_id = :id";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", id);
		
		Author author = namedParameterTemplate.queryForObject(sql, namedParameters, new AuthorRowMapper());
		
		return author;
	}

	@Override
	public List<Author> getAuthorList() throws SQLException {
		String sql = "SELECT * FROM author";
		List<Author> authorList = new ArrayList<Author>();
		
		authorList = template.query(sql, new AuthorRowMapper());
		return authorList;
	}

	@Override
	public void createAuthor(Author author) throws SQLException {
		String sql = "INSERT INTO author (first_name, last_name, birth_date, death_date, description) VALUES (:first_name, :last_name, :birth_date, :death_date, :description)";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("first_name", author.getFirstName());
		params.addValue("last_name", author.getLastName());
		params.addValue("birth_date", author.getBirthDate());
		params.addValue("death_date", author.getDeathDate());
		params.addValue("description", author.getDescription());
		
		namedParameterTemplate.update(sql, params);	
		
	}

	@Override
	public void updateAuthor(Author author) throws SQLException {
		String sql = "UPDATE author SET first_name = :first_name, last_name = :last_name, birth_date = :birth_date, death_date = :death_date, description = :description WHERE author_id = :author_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("author_id", author.getId());
		params.addValue("first_name", author.getFirstName());
		params.addValue("last_name", author.getLastName());
		params.addValue("birth_date", author.getBirthDate());
		params.addValue("death_date", author.getDeathDate());
		params.addValue("description", author.getDescription());
		
		namedParameterTemplate.update(sql, params);
		
	}

	@Override
	public void deleteAuthor(Author author) throws SQLException {
		String sql = "DELETE FROM author WHERE author_id = :author_id";
		
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("author_id", author.getId());
		
		namedParameterTemplate.update(sql, params);
		
	}

}
