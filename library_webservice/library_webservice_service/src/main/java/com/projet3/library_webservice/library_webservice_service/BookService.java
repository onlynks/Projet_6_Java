package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webservice.library_webservice_model.beans.Book;

@WebService(serviceName="BookService")
public class BookService extends AbstractBookService {
	
	public static void main(String[] args) throws SQLException {
	  /*
	  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	  
	  BookService bookService = new BookService();
	  
	  Map<Book,Integer>bookList = bookService.getBookList();
	  
	  for (Map.Entry<Book, Integer> entry : bookList.entrySet())
	  {
	      System.out.println(entry.getKey().getTitle() + "/" + entry.getValue() + entry.getKey().getAvailable());
	  }
	  */
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
	public MapWrapper getBookList(){
		
		MapWrapper mapWrapper = null;
		
		try {
			mapWrapper = new MapWrapper();
			mapWrapper.setBookMap(bookManager.getBookList());
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		return mapWrapper;		
	}
	
	@WebMethod
	public List<Book> getUserBorrowing(int userId){
		List<Book> bookList = null;
		
		try {
			bookList = bookManager.getBorrowedBook(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookList;
		
	}
	
	@WebMethod
	public List<Book> bookResearch(String title){
		List<Book> bookFound = null;
		
		try {
			bookFound = bookManager.bookResearch(title);
		} catch (SQLException e) {
			e.printStackTrace();		}
		
		return bookFound;
		
	}
	
	@WebMethod
	public void extendBorrowing(int bookId) {
		try {
			bookManager.extendBorrowing(bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@WebMethod
	public void deleteBorrowing(int bookId) {
		
		try {
			bookManager.deleteBorrowing(bookId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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