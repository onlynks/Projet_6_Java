package com.projet3.webservice.Business.impl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import com.projet3.webservice.Business.interfaces.BookManager;
import com.projet3.webservice.Consumer.DAO.BookDAO;
import com.projet3.webservice.Model.beans.Book;

public class BookManagerImpl implements BookManager
{
	@Autowired
	private BookDAO bookDAO;
	
	public Book getBook( String title ) throws SQLException
    {
    	Book book = bookDAO.getBook(title);
        
        return book;
    }
  
}