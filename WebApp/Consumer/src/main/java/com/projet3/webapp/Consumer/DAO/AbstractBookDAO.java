package com.projet3.webapp.Consumer.DAO;


import com.projet3.webapp.Model.BookService;

public abstract class AbstractBookDAO {
	
	protected static BookService serviceConnection;

	public static void setServiceConnection(BookService serviceConnection) {
		AbstractBookDAO.serviceConnection = serviceConnection;
	}
	


	
	

}
