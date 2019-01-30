package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webservice.library_webservice_business.interfaces.BookManager;
import com.projet3.library_webservice.library_webservice_model.beans.Book;

@WebService(serviceName="BookService")
public class BookService extends AbstractBookService {

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
	
	public List<Book> bookResearch(String title){
		List<Book> bookFound = null;
		
		try {
			bookFound = bookManager.bookResearch(title);
		} catch (SQLException e) {
			e.printStackTrace();		}
		
		return bookFound;
		
	}
	
	public void createBook(Book book) {
		try {
			bookManager.createBook(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}