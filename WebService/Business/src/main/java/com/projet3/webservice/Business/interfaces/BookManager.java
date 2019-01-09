package com.projet3.webservice.Business.interfaces;

import java.sql.SQLException;

import com.projet3.webservice.Model.beans.Book;

public interface BookManager {
	
	public Book getBook(String title) throws SQLException;
}