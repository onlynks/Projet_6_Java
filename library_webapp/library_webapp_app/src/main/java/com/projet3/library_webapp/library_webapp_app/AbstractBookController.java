package com.projet3.library_webapp.library_webapp_app;

import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;

public abstract class AbstractBookController {
	
	protected static BookManager bookManager;
	
	public static void setBookManager(BookManager bookManager) {
		AbstractBookController.bookManager = bookManager;
	}	

}
