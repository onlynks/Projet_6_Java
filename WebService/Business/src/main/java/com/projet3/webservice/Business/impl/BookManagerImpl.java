package com.projet3.webservice.Business.impl;

import java.sql.SQLException;
import com.projet3.webservice.Business.interfaces.BookManager;
import com.projet3.webservice.Consumer.DAO.BookDAO;
import com.projet3.webservice.Consumer.DAO.DAOFactory;
import com.projet3.webservice.Model.beans.Book;

public class BookManagerImpl implements BookManager
{
	public String getBook( String title ) throws SQLException
    {
    	DAOFactory Factory = DAOFactory.getInstance();
    	BookDAO bookDAO = Factory.getBookDAO();
    	
    	Book book = bookDAO.getBook(title);    	
    	String description = book.getDescription();
        
        return description;
    }
}