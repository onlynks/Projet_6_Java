package com.projet3.library_webapp.library_webapp_app;

import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;
import com.projet3.library_webapp.library_webapp_business.interfaces.BookingManager;

public abstract class AbstractBookController {
	
	protected static BookManager bookManager;
	protected static BookingManager bookingManager;
	
	public static void setManagers(BookManager bookManager, BookingManager bookingManager) {
		AbstractBookController.bookManager = bookManager;
		AbstractBookController.bookingManager = bookingManager;
	}

}
