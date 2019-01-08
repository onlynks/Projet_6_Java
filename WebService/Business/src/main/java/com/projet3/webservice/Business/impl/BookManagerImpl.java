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
    	if(Factory == null)return"Factory";
    	BookDAO bookDAO = Factory.getBookDAO();
    	if(bookDAO == null)return"bookDAO";
    	Book book = bookDAO.getBook(title); 
    	if(book == null)return"book";
    	String description = book.getDescription();
        
        return description;
    }
}