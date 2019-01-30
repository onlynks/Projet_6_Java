package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.Author;

public interface AuthorDAO {
	public Author getAuthorByID(int id) throws SQLException;
	
	public List<Author> getAuthorList() throws SQLException;
	
	public void createAuthor(Author author) throws SQLException;
	
	public void updateAuthor(Author author) throws SQLException;
	
	public void deleteAuthor(Author author) throws SQLException;

}
