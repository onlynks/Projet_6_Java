package com.projet3.library_webapp.library_webapp_app;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;
import com.projet3.library_webapp.library_webapp_model.user.Role;
import com.projet3.library_webapp.library_webapp_model.user.User;

@Controller
public class BookController extends AbstractBookController {	
	
	
	public static void main(String arg[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		Role role = new Role();
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
	
	@GetMapping("/userBorrowing")
	public String getUserBorrowing(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Map<Borrowing,Map<String,String>> borrowedBooks = bookManager.getUserBorrowing(user);
		model.addAttribute("borrowedBooks", borrowedBooks);
		
		return "userBorrowing";
	}

	@RequestMapping("/bookResearch")
	public String bookResearch(@RequestParam("title") String title, Model model){
		Map<Book,Integer> bookFound = bookManager.bookResearch(title);
		model.addAttribute("bookFound", bookFound);
		
		return "bookFound";
	}
	
	@RequestMapping("extendBorrowing/{borrowingId}")
	public String extendBorrowing(HttpServletRequest request,
								  Model model,
								  @PathVariable("borrowingId") int borrowingId) {
		bookManager.extendBorrowing(borrowingId);
		
		return this.getUserBorrowing(request, model);
	}
	
	

}
