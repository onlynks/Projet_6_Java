package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;

public class BookDAOImpl extends AbstractBookDAO implements BookDAO {

	public Book getBook(int id) {
		Book book = bookServiceConnection.getBook(id);
		
		return book;
	}

	public List<Book> getBookList() {
		
		List<Book> bookList =  bookServiceConnection.getBookList();
		
		return bookList;
	}

	public List<Book> bookResearch(String title) {
		
		List<Book> bookFound = bookServiceConnection.bookResearch(title);
		return bookFound;
	}

	public List<Borrowing> getUserBorrowing(int userId) {
		List<Borrowing> bookFound = bookServiceConnection.getUserBorrowing(userId);
		return bookFound;
	}

	public void extendBorrowing(int borrowingId) {
		bookServiceConnection.extendBorrowing(borrowingId);		
	}

}
