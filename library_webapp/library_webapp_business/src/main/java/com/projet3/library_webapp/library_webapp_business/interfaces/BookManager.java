package com.projet3.library_webapp.library_webapp_business.interfaces;

import java.util.List;

import com.projet3.library_webapp.library_webapp_model.Book;

public interface BookManager {
	
	public Book getBook(String title);
	
	public List<Book> getBookList();
}


