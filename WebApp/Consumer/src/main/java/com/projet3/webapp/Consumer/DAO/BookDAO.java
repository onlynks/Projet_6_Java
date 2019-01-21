package com.projet3.webapp.Consumer.DAO;

import java.util.List;
import com.projet3.webapp.Model.Book;

public interface BookDAO {
	public Book getBook(String title);
	
	public List<Book> getBookList();	

}
