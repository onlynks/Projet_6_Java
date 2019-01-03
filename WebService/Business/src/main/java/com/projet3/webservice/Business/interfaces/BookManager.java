package com.projet3.webservice.Business.interfaces;

import java.sql.SQLException;

public interface BookManager {
	
	public String getBook(String title) throws SQLException;
}