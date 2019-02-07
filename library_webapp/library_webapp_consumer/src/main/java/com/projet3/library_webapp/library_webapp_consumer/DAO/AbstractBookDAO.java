package com.projet3.library_webapp.library_webapp_consumer.DAO;

import com.projet3.library_webapp.library_webapp_model.book.BookService;

public abstract class AbstractBookDAO {
	
	protected static BookService bookServiceConnection;

	public static void setBookServiceConnection(BookService serviceConnection) {
		AbstractBookDAO.bookServiceConnection = serviceConnection;
	}	

}
