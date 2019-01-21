package com.projet3.webapp.Business.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.projet3.webapp.Business.interfaces.BookManager;
import com.projet3.webapp.Consumer.DAO.BookDAO;
import com.projet3.webapp.Model.Book;

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
