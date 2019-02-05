package com.projet3.library_webapp.library_webapp_app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet3.library_webapp.library_webapp_model.book.Book;


@Controller
public class BookController extends AbstractBookController {	
	
	@RequestMapping(value= {"/", "/home"})
	public String getHomePage() {
		return "index";
	}	

	@GetMapping("/book")
	public String getBook(@RequestParam(name="title", required=false) String title, Model model) {
		//model.addAttribute("title", title);
		Book book = bookManager.getBook("Tintin");
		String description = book.getDescription();
		model.addAttribute("description", description);
		return "bookForm";		
	}
	
	@GetMapping("/bookList")
	public String getBookList(Model model) {
		List<Book> bookList = bookManager.getBookList();
		model.addAttribute("bookList", bookList);
		
		return "bookList";
	}
	
	

}
