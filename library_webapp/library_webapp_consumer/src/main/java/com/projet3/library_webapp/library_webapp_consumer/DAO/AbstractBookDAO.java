package com.projet3.library_webapp.library_webapp_consumer.DAO;

import com.projet3.library_webapp.library_webapp_model.BookService;

public abstract class AbstractBookDAO {
	
	protected static BookService serviceConnection;

	public static void setServiceConnection(BookService serviceConnection) {
		AbstractBookDAO.serviceConnection = serviceConnection;
	}
	


	
	

}
