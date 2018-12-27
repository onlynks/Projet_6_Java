package org.Business.impl;

import org.Business.interfaces.BookManager;

public class ManagerFactoryImpl {
	private BookManager bookManager;
	
	public BookManager getBookManager() {
		return bookManager;
	}
	
	public void setBookManager(BookManager IBookManager) {
		bookManager = IBookManager;
	}	

}
