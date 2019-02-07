package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.MapWrapper;
import com.projet3.library_webapp.library_webapp_model.book.MapWrapper.BookMap.Entry;

public class BookDAOImpl extends AbstractBookDAO implements BookDAO {

	public Book getBook(String title) {
		Book book = bookServiceConnection.getBook(title);
		
		return book;
	}

	public Map<Book, Integer> getBookList() {
		Map<Book, Integer> bookList = new HashMap<Book, Integer>();		
		MapWrapper mapWrapper = bookServiceConnection.getBookList();
		
		List<Entry> entries = mapWrapper.getBookMap().getEntry();
		
		for(int i = 0; i<entries.size();i++) {
			bookList.put(entries.get(i).getKey(), entries.get(i).getValue());
		}
		
		return bookList;
	}

	public List<Book> bookResearch(String title) {
		
		List<Book> bookFound = bookServiceConnection.bookResearch(title);
		return bookFound;
	}

}
