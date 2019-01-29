package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.webservice.Model.beans.Publisher;

public interface PublisherDAO {
	public Publisher getPublisherByID(int id) throws SQLException;
	
	public List<Publisher> getPublisherList() throws SQLException;
	
	public void createPublisher(Publisher publisher) throws SQLException;
	
	public void updatePublisher(Publisher publisher) throws SQLException;
	
	public void deletePublisher(Publisher publisher) throws SQLException;

}
