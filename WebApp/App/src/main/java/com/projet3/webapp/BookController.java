package com.projet3.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet3.webapp.Model.Book;

@Controller
public class BookController extends AbstractBookController {	
	
	@GetMapping("/book")
	public String getBook(@RequestParam(name="title", required=false) String title, Model model) {
		//model.addAttribute("title", title);
		Book book = bookManager.getBook("Tintin");
		String description = book.getDescription();
		model.addAttribute("description", description);
		return "bookForm";

		
	}

}
