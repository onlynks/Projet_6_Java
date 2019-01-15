package com.projet3.webapp;

public class Main {

	public static void main(String[] args) {
		BookServiceService bookServiceCall = new BookServiceService();		
		BookService bookService = bookServiceCall.getBookServicePort();
		
		String description = bookService.getDescription("Le petit cheval de manège");
		System.out.println(description);		

	}

}
