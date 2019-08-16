package com.projet3.library_webservice.library_webservice_service;

import com.projet3.library_webservice.library_webservice_business.interfaces.BookManager;
import com.projet3.library_webservice.library_webservice_business.interfaces.BookingManager;

public abstract class AbstractBookService {
	
	protected static BookManager bookManager;	
	protected static BookingManager bookingManager;
	
	public static void setManagers(BookingManager bookingManager, BookManager bookManager) {
		AbstractBookService.bookingManager = bookingManager;
		AbstractBookService.bookManager = bookManager;
	}
	

}
