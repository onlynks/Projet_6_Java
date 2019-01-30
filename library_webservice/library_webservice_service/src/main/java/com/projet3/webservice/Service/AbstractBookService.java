package com.projet3.webservice.Service;

import com.projet3.webservice.Business.interfaces.BookManager;

public abstract class AbstractBookService {
	
	protected static BookManager bookManager;

	public static void setBookManager(BookManager bookManager) {
		AbstractBookService.bookManager = bookManager;
	}	
	

}
