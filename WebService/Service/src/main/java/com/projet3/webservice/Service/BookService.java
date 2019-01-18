package com.projet3.webservice.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import com.projet3.webservice.Business.interfaces.BookManager;
import com.projet3.webservice.Model.beans.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService(serviceName="BookService")
public class BookService extends AbstractBookService {
/*
	public static void main(String[] args) throws SQLException {
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	  
	  BookService bookService = new BookService();
	  List<Book> bookList = bookService.getBookList();
	  //String description = book.getDescription();
	  System.out.print(bookList);
	  
	 }
	
	public BookManager getBookManager() {
		return bookManager;
	}
*/

	@WebMethod
	public Book getBook(String title) {

		Book book = null;
		try {
			book = bookManager.getBook(title);
		} catch (SQLException e) {
			e.printStackTrace();		}
		
		return book;
	}
	
	@WebMethod
	public List<Book> getBookList(){
		List<Book> bookList = null;
		
		try {
			bookList = bookManager.getBookList();
		} catch (SQLException e) {
			e.printStackTrace();		}
		
		return bookList;
	}
	


}