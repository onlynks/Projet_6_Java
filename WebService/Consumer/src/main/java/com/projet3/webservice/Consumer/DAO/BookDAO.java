package com.projet3.webservice.Consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.webservice.Model.beans.Book;

public interface BookDAO {
	public Book getBook(String title) throws SQLException;
	
	public List<Book> getBookList() throws SQLException;
	
	public List<Book> bookResearch(String title) throws SQLException;
	
	public void createBook(Book book) throws SQLException;
	
	public void updateBook(Book book) throws SQLException;
	
	public void deleteBook(Book book) throws SQLException;
}