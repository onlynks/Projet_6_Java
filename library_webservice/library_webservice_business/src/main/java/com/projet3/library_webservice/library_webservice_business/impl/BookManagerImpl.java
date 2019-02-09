package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webservice.library_webservice_business.interfaces.BookManager;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BorrowingDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.UserDAO;
import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;

public class BookManagerImpl implements BookManager
{
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private BorrowingDAO borrowingDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	public Book getBook( int id ) throws SQLException
    {
    	Book book = bookDAO.getBookById(id);
        
        return book;
    }

	@Override
	public List<Book> getBookList() throws SQLException {
		List<Book> bookList = bookDAO.getBookList();
		
		return bookList;
	}

	@Override
	public List<Book> bookResearch(String title) throws SQLException {
		List<Book> bookFound = bookDAO.bookResearch(title);
		
		return bookFound;
	}

	@Override
	public void createBook(Book book) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Borrowing> getBorrowings(int userId) throws SQLException {
		
		List<Borrowing> borrowingList = borrowingDAO.getBorrowingByUser(userDAO.getUserById(userId));
		
		return borrowingList;		
	}

	@Override
	public void extendBorrowing(int bookId) throws SQLException {

		Borrowing borrowing = borrowingDAO.getBorrowingByBook(bookDAO.getBookById(bookId));
		
		Date dateToUpdate = borrowing.getEndingDate();
		
		Calendar myCal = Calendar.getInstance();
		myCal.setTime(dateToUpdate);    
		myCal.add(Calendar.MONTH, +1);
		Date updatedDate = myCal.getTime();
		borrowing.setEndingDate(updatedDate);
		
		borrowingDAO.updateBorrowing(borrowing);
		
	}

	@Override
	public void deleteBorrowing(int bookId) throws SQLException {
		Borrowing borrowing = borrowingDAO.getBorrowingByBook(bookDAO.getBookById(bookId));
		borrowingDAO.deleteBorrowing(borrowing);
		
	}
  
}