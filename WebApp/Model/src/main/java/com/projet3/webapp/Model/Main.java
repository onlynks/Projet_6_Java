package com.projet3.webapp.Model;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookService_Service bookServiceCall = new BookService_Service();		
		BookService bookService = bookServiceCall.getBookServicePort();
		/*
		Book book = bookService.getBook("Tintin");
		String description = book.getDescription();
		System.out.println(description);
		*/
		List<Book> bookList = bookService.getBookList();
		Book book = bookList.get(1);
		String description = book.getDescription();
		System.out.println(description);

	}

}
