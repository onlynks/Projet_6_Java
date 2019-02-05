package com.projet3.library_webservice.library_webservice_business.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

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
	
	public Book getBook( String title ) throws SQLException
    {
    	Book book = bookDAO.getBookByTitle(title);
        
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
	public List<Book> getBorrowedBook(int userId) throws SQLException {
		
		List<Integer> borrowedBook = borrowingDAO.getBorrowingByUser(userDAO.getUserById(userId));
		List<Book> bookList = new ArrayList<Book>();
		
		for (int i = 0; i < borrowedBook.size(); i++) {
			bookList.add(bookDAO.getBookById(borrowedBook.get(i)));
		}
		/*
		borrowedBook.forEach((bookId) -> {
			try {
				bookList.add(bookDAO.getBookById(bookId));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});
		*/
		return bookList;		
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