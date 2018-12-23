package org.Business;

import java.sql.SQLException;

import org.Consumer.DAO.BookDAO;
import org.Consumer.DAO.DAOFactory;
import org.beans.Book;

public class App 
{
	
    public static void main( String[] args ) throws SQLException
    {
    	DAOFactory Factory = DAOFactory.getInstance();
    	BookDAO bookDAO = Factory.getBookDAO();
    	
    	Book book = bookDAO.getBook("Le petit cheval de manège");
    	
    	String title = book.getTitle();
        System.out.println( title);
    }
}
