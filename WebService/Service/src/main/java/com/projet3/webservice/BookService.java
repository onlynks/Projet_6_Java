package com.projet3.webservice;

import java.sql.SQLException;
import org.Business.BookManager;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "BookService")
public class BookService {
	
	public static void main(String[] args) throws SQLException {
		BookManager manager = new BookManager();
		String description = manager.getBook("Le petit cheval de manège");
		
		System.out.println( description);
	}
	
	@WebMethod
	public String getDescription(String title) throws SQLException {
		BookManager manager = new BookManager();
		String description = manager.getBook(title);
		
		return description;
	}

}
