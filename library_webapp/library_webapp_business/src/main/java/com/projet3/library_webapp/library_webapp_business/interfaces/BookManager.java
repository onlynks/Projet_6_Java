package com.projet3.library_webapp.library_webapp_business.interfaces;

import java.util.List;
import java.util.Map;

import com.projet3.library_webapp.library_webapp_model.book.Book;

public interface BookManager {
	
	public Book getBook(String title);
	
	public Map<Book,Integer> getBookList();
	
	public Map<Book,Integer> bookResearch(String title);
}


