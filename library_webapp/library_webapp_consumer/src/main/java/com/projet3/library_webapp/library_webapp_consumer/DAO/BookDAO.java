package com.projet3.library_webapp.library_webapp_consumer.DAO;

import java.util.List;

import com.projet3.library_webapp.library_webapp_model.Book;

public interface BookDAO {
	public Book getBook(String title);
	
	public List<Book> getBookList();	

}
