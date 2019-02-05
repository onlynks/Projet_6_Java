package com.projet3.library_webapp.library_webapp_business.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;
import com.projet3.library_webapp.library_webapp_consumer.DAO.BookDAO;
import com.projet3.library_webapp.library_webapp_model.book.Book;

public class BookManagerImpl implements BookManager
{
	@Autowired
	private BookDAO bookDAO;
	
	public Book getBook( String title ) {
    	Book book = bookDAO.getBook(title);
        
        return book;
    }
	
	public List<Book> getBookList() {
		List<Book> bookList = bookDAO.getBookList();
		
		return bookList;
	}
  
}
