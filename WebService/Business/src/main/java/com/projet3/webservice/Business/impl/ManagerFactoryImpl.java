package com.projet3.webservice.Business.impl;

import com.projet3.webservice.Business.interfaces.BookManager;
import com.projet3.webservice.Business.interfaces.ManagerFactory;

public class ManagerFactoryImpl implements ManagerFactory{
	
	private BookManager bookManager;
	
	public BookManager getBookManager() {
		return bookManager;
	}
	
	public void setBookManager(BookManager IBookManager) {
		bookManager = IBookManager;
	}	

}