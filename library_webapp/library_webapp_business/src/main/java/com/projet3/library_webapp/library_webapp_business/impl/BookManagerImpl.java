package com.projet3.library_webapp.library_webapp_business.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;
import com.projet3.library_webapp.library_webapp_consumer.DAO.BookDAO;
import com.projet3.library_webapp.library_webapp_model.book.Book;

public class BookManagerImpl implements BookManager
{
	@Autowired
	private BookDAO bookDAO;
	
	public Book getBook( String title ) {
    	Book book = bookDAO.getBook(title);
        
        return book;
    }
	
	public Map<Book,Integer> getBookList() {
	
		return bookDAO.getBookList();
	}

	public Map<Book,Integer> bookResearch(String title) {
		List<Book> bookFound = bookDAO.bookResearch(title);		
		Map<Book,Integer> bookFoundQuantity = this.getListQuantity(bookFound);
		
		return bookFoundQuantity;
	}

	private Map<Book,Integer> getListQuantity(List<Book> bookList) {
		
		Map<Book, Integer> booksAndQuantities = new HashMap<Book, Integer>();
		
		Map<String, Integer> titleList = new HashMap<String,Integer>();;
		
		for(int i=0; i<bookList.size(); i++)  {
			Boolean available = bookList.get(i).isAvailable();			
			
			if(titleList.containsKey(bookList.get(i).getTitle())) {		
				
				for(Entry<String, Integer> e : titleList.entrySet()) {
					if(available && e.getKey().equals(bookList.get(i).getTitle())) {
						e.setValue(e.getValue()+1);
					}					
			    }
			} else {
				titleList.put(bookList.get(i).getTitle(), available==true?1:0);
				booksAndQuantities.put(bookList.get(i), null);
			}
			
		}
		
		for(Entry<Book, Integer> e : booksAndQuantities.entrySet()) {
			e.setValue(titleList.get(e.getKey().getTitle()));				
	    }
		return booksAndQuantities;
		
	}
  
}
