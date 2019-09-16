package com.projet3.library_webapp.library_webapp_app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Booking;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;
import com.projet3.library_webapp.library_webapp_model.user.Role;
import com.projet3.library_webapp.library_webapp_model.user.User;

@Controller
public class BookController extends AbstractBookController {	
	
	
	public static void main(String arg[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		BookController bookController = new BookController();
		
	}
	
	
	@RequestMapping(value= {"/", "/home"})
	public String getHomePage() {
		return "index";
	}	
	
	@GetMapping("/bookList")
	public String getBookList(Model model) {
		Map<Book,Integer> bookList = bookManager.getBookList();
		
		if (bookList.values().contains(0)) {
			Map<String, NotAvailableInfos> notAvailableInfos = new HashMap<String, NotAvailableInfos>();
			List<Book> notAvailableBooks = bookList.entrySet().stream().filter( e -> e.getValue() == 0).map(Map.Entry::getKey).collect(Collectors.toList());
			notAvailableBooks.forEach(book -> {
				NotAvailableInfos infos = new NotAvailableInfos();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
				infos.setBookingQuantity(bookingManager.getBookingQuantity(book.getTitle()));
				infos.setNextReturnDate(format.format(bookingManager.getNextBookingReturn(book.getTitle())));
				notAvailableInfos.put(book.getTitle(), infos);						
			});
			model.addAttribute("notAvailableInfos", notAvailableInfos);
		}
		
		model.addAttribute("bookList", sortMap(bookList));
		
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
		
		if (bookFound.values().contains(0)) {
			Map<String, NotAvailableInfos> notAvailableInfos = new HashMap<String, NotAvailableInfos>();
			List<Book> notAvailableBooks = bookFound.entrySet().stream().filter( e -> e.getValue() == 0).map(Map.Entry::getKey).collect(Collectors.toList());
			notAvailableBooks.forEach(book -> {
				NotAvailableInfos infos = new NotAvailableInfos();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
				infos.setBookingQuantity(bookingManager.getBookingQuantity(book.getTitle()));
				infos.setNextReturnDate(format.format(bookingManager.getNextBookingReturn(book.getTitle())));
				notAvailableInfos.put(book.getTitle(), infos);						
			});
			model.addAttribute("notAvailableInfos", notAvailableInfos);
		}
		
		model.addAttribute("bookFound", sortMap(bookFound));
		
		return "bookFound";
	}
	
	@RequestMapping("extendBorrowing/{borrowingId}")
	public String extendBorrowing(HttpServletRequest request,
								  Model model,
								  @PathVariable("borrowingId") int borrowingId) {
		bookManager.extendBorrowing(borrowingId);
		
		return this.getUserBorrowing(request, model);
	}
	
	@GetMapping("/userBooking")
	public String getBookingList(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		List<Booking> bookingList = bookingManager.getBookingForUser(user.getId());
		
		if ( bookingList.size() > 0 ) {
			Map<Booking, String> bookingAndReturnDates = new HashMap<>();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
			
			bookingList.forEach( booking -> {
				String returnDate = format.format(bookingManager.getNextBookingReturn(booking.getBookTitle()));
				bookingAndReturnDates.put(booking, returnDate);
			});
			
			model.addAttribute("bookingList", bookingAndReturnDates);
		}
		
				
		return "userBooking";
	}
	
	@PostMapping("/createBooking")
	public ResponseEntity<String> createBooking(@RequestParam("title") String title, HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		String response = bookingManager.createBooking(user.getId(), title);
		ResponseMessage responseMessage = new ResponseMessage();
		return new ResponseEntity<String>(responseMessage.response.get(response), HttpStatus.OK);	
	}
	
	@GetMapping("/deleteBooking")
	public String deleteBooking(@RequestParam("bookTitle") String bookTitle, HttpServletRequest request) {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		bookingManager.deleteBooking(bookTitle, user.getId());
		
		return "redirect:userBooking";	
	}
	
	public Map<Book, Integer> sortMap(Map<Book, Integer> map) {
		Map<Book,Integer> sorted = map.entrySet().stream()
			       .sorted(Map.Entry.comparingByValue())
			       .collect(Collectors.toMap(
			    	          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		return sorted;		
	}
	

}
