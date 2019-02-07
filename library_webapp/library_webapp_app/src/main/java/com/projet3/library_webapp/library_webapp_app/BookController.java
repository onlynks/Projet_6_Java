package com.projet3.library_webapp.library_webapp_app;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet3.library_webapp.library_webapp_model.book.Book;

@Controller
public class BookController extends AbstractBookController {	
	
	
	public static void main(String arg[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		
		System.out.println(bookManager.bookResearch("i"));		
	}
	
	@RequestMapping(value= {"/", "/home"})
	public String getHomePage() {
		return "index";
	}	
	
	@GetMapping("/bookList")
	public String getBookList(Model model) {
		Map<Book,Integer> bookList = bookManager.getBookList();
		model.addAttribute("bookList", bookList);
		
		return "bookList";
	}
	
	@RequestMapping("/bookResearch")
	public String bookResearch(@RequestParam("title") String title, Model model){
		Map<Book,Integer> bookFound = bookManager.bookResearch(title);
		model.addAttribute("bookFound", bookFound);
		
		return "bookFound";
	}
	
	

}
