package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.Publisher;

public interface PublisherDAO {
	public Publisher getPublisherByID(int id) throws SQLException;
	
	public List<Publisher> getPublisherList() throws SQLException;
	
	public void createPublisher(Publisher publisher) throws SQLException;
	
	public void updatePublisher(Publisher publisher) throws SQLException;
	
	public void deletePublisher(Publisher publisher) throws SQLException;

}
