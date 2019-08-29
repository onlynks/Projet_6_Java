package com.projet3.library_webservice.library_webservice_business.interfaces;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;

public interface BookManager {
	
	public Book getBook(int id) throws SQLException;	
	public List<Book> getBookList() throws SQLException;	
	public List<Book> bookResearch(String title) throws SQLException;	
	public void createBook(Book book) throws SQLException;	
	public List<Borrowing> getBorrowings(int  userId) throws SQLException;	
	public void extendBorrowing(int bookId) throws SQLException;	
	public void deleteBorrowing (int bookId) throws SQLException;
	public Date getNextBookReturn(String bookTitle) throws SQLException;
}