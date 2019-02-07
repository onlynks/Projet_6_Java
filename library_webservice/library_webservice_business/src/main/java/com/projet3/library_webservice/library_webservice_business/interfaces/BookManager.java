package com.projet3.library_webservice.library_webservice_business.interfaces;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.projet3.library_webservice.library_webservice_model.beans.Book;

public interface BookManager {
	
	public Book getBook(String title) throws SQLException;
	
	public Map<Book, Integer> getBookList() throws SQLException;
	
	public List<Book> bookResearch(String title) throws SQLException;
	
	public void createBook(Book book) throws SQLException;
	
	public List<Book> getBorrowedBook(int  userId) throws SQLException;
	
	public void extendBorrowing(int bookId) throws SQLException;
	
	public void deleteBorrowing (int bookId) throws SQLException;
}