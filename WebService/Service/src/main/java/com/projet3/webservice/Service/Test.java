package com.projet3.webservice.Service;

import java.sql.SQLException;

import com.projet3.webservice.Business.impl.BookManagerImpl;

public class Test {
	
	public static void main(String[] args) throws SQLException {

		BookManagerImpl bookManager = new BookManagerImpl();
		String description = bookManager.getBook("Tintin").getDescription();
		System.out.println( description);
	}

}
