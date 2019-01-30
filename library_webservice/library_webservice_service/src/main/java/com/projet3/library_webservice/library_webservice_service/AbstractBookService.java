package com.projet3.library_webservice.library_webservice_service;

import com.projet3.library_webservice.library_webservice_business.interfaces.BookManager;

public abstract class AbstractBookService {
	
	protected static BookManager bookManager;

	public static void setBookManager(BookManager bookManager) {
		AbstractBookService.bookManager = bookManager;
	}	
	

}
