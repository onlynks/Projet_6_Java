package org.Business;

import java.sql.SQLException;

import org.Consumer.DAO.BookDAO;
import org.Consumer.DAO.DAOFactory;
import org.beans.Book;

public class BookManager 
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
