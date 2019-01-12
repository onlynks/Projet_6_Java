package com.projet3.webservice.Service;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import com.projet3.webservice.Business.interfaces.BookManager;
import com.projet3.webservice.Model.beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService
public class BookService extends AbstractBookService {

	//@Autowired
	//private BookManager bookManager;

	
	 

/*
	public static void main(String[] args) throws SQLException {
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	  
	  BookService bookService = new BookService();
	  String description = bookService.getDescription("Tintin");
	  System.out.print(description);

	  
	 //Endpoint.publish("http://localhost:8082/service", new BookService()); }
	 }
	
	public BookManager getBookManager() {
		return bookManager;
	}
 
*/
	@WebMethod
	public String getDescription(String title) {

		Book book = null;
		try {
			book = bookManager.getBook(title);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		}
		
		String description = book.getDescription();/*
		String description = null;
		if(bookManager == null) {
			description = "nul";
		}else {
			description = "pas nul";
		}*/
		return description;
	}


}