package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import com.projet3.library_webapp.library_webapp_model.book.Book;

public class BookDAOImpl extends AbstractBookDAO implements BookDAO {

	public Book getBook(String title) {
		Book book = serviceConnection.getBook(title);
		
		return book;
	}

	public List<Book> getBookList() {
		List<Book> bookList = serviceConnection.getBookList();
		return bookList;
	}

}
