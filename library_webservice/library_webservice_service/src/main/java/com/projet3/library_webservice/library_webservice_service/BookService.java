package com.projet3.library_webservice.library_webservice_service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;

@WebService(serviceName="BookService")
public class BookService extends AbstractBookService {
	

/*
	 public static void main(String[] args) throws SQLException {
	  
	  ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
	  
	  BookService bookService = new BookService();
	  Date response = bookService.getNextBookReturn("Le tour du monde en quatre-vingts jours");
	  System.out.print("/");

	 }	
*/

	@WebMethod
	public Book getBook(int id) {

		Book book = null;
		try {
			book = bookManager.getBook(id);
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
	public List<Borrowing> getUserBorrowing(int userId){
		List<Borrowing> bookList = null;
		
		try {
			bookList = bookManager.getBorrowings(userId);
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
	
	@WebMethod
	public String createBooking(int userId, String bookTitle) {
		String responseMessage = null;
		
		try {
			bookingManager.createBooking(userId, bookTitle);
			responseMessage = "CREATED";
		} catch (Exception e) {
			responseMessage = e.getMessage();
		}
		return responseMessage;
	}
	
	@WebMethod
	public Date getNextBookReturn(String bookTitle) {
		Date nextBookReturn = null;
		try {
			nextBookReturn =  bookManager.getNextBookReturn(bookTitle);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nextBookReturn;
	}
	
	@WebMethod
	public Integer getBookingQuantity(String bookTitle) {
		Integer bookingQuantity = null;
		
		try {
			bookingQuantity =  bookingManager.getBookingQuantity(bookTitle);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookingQuantity;
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