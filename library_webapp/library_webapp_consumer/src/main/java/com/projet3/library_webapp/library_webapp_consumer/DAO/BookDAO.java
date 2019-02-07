package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;
import java.util.Map;

import com.projet3.library_webapp.library_webapp_model.book.Book;

public interface BookDAO {
	public Book getBook(String title);
	
	public Map<Book, Integer> getBookList();
	
	public List<Book> bookResearch(String title);

}
