package com.projet3.webapp.Consumer.DAO;

import java.util.List;
import com.projet3.webapp.Model.Book;

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
