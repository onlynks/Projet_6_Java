package com.projet3.webapp;

import com.projet3.webapp.Business.interfaces.BookManager;

public abstract class AbstractBookController {
	
	protected static BookManager bookManager;
	
	public static void setBookManager(BookManager bookManager) {
		AbstractBookController.bookManager = bookManager;
	}	

}
