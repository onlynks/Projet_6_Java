package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webservice.library_webservice_business.interfaces.BookManager;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookDAO;
import com.projet3.library_webservice.library_webservice_model.beans.Book;

public class BookManagerImpl implements BookManager
{
	@Autowired
	private BookDAO bookDAO;
	
	public Book getBook( String title ) throws SQLException
    {
    	Book book = bookDAO.getBookByTitle(title);
        
        return book;
    }

	@Override
	public List<Book> getBookList() throws SQLException {
		List<Book> bookList = bookDAO.getBookList();
		
		return bookList;
	}

	@Override
	public List<Book> bookResearch(String title) throws SQLException {
		List<Book> bookFound = bookDAO.bookResearch(title);
		
		return bookFound;
	}

	@Override
	public void createBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		
	}
  
}