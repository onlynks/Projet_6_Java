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
public class BookService {

	@Autowired
	private BookManager bookManager;

	
	 public static void main(String[] args) throws SQLException {
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	  
	  BookService bookService = (BookService) context.getBean("bookService");
	  BookManager manager = bookService.getBookManager();
	  Book book = manager.getBook("Tintin");
	  String description = book.getDescription();
	  System.out.print(description);

	  
	 //Endpoint.publish("http://localhost:8082/service", new BookService()); }
	 }

	@WebMethod
	public String getDescription(String title) {

		return null;

	}

	public BookManager getBookManager() {
		return bookManager;
	}
	
//	  @WebMethod(exclude = true) public static ManagerFactoryImpl
//	  getManagerFactory() { return bookManager; }
//	  
//	  @WebMethod(exclude = true) public static void
//	  setManagerFactory(ManagerFactoryImpl managerFactory) { Book.managerFactory =
//	  managerFactory; }
	 

}