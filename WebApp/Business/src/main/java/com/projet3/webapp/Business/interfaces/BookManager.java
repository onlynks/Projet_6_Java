package com.projet3.webapp.Business.interfaces;

import java.util.List;
import com.projet3.webapp.Model.Book;

public interface BookManager {
	
	public Book getBook(String title);
	
	public List<Book> getBookList();
}


