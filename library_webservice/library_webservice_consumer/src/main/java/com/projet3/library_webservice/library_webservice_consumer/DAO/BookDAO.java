package com.projet3.library_webservice.library_webservice_consumer.DAO;

import java.sql.SQLException;
import java.util.List;

import com.projet3.library_webservice.library_webservice_model.beans.Book;


public interface BookDAO {
	public Book getBookByTitle(String title) throws SQLException;
	
	public Book getBookById(int id) throws SQLException;
	
	public List<Book> getBookList() throws SQLException;
	
	public List<Book> bookResearch(String title) throws SQLException;
	
	public void createBook(Book book) throws SQLException;
	
	public void updateBook(Book book) throws SQLException;
	
	public void deleteBook(Book book) throws SQLException;
	
	public int countBook(String title) throws SQLException;
}