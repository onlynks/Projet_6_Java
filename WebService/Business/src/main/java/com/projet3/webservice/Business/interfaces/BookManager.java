package com.projet3.webservice.Business.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.projet3.webservice.Model.beans.Book;

public interface BookManager {
	
	public Book getBook(String title) throws SQLException;
	
	public List<Book> getBookList() throws SQLException;
	
	public List<Book> bookResearch(String title) throws SQLException;
	
	public void createBook(Book book) throws SQLException;
}