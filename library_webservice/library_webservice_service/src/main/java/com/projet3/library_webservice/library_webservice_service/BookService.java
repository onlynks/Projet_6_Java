package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.projet3.library_webservice.library_webservice_model.beans.Book;

@WebService(serviceName="BookService")
public class BookService extends AbstractBookService {
/*
	public static void main(String[] args) throws SQLException {
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	  
	  BookService bookService = new BookService();
	  
	  System.out.print(bookService.getUserBorrowing(2));
	  
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
			e.printStackTrace();
		}
			
			return bookList;		
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