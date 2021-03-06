package com.projet3.library_webapp.library_webapp_batch;


import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projet3.library_webapp.library_webapp_batch.email.MailToSend;
import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;
import com.projet3.library_webapp.library_webapp_business.interfaces.BookingManager;
import com.projet3.library_webapp.library_webapp_business.interfaces.UserManager;
import com.projet3.library_webapp.library_webapp_model.book.Book;
import com.projet3.library_webapp.library_webapp_model.book.Booking;
import com.projet3.library_webapp.library_webapp_model.user.User;

@Component
public class DeadlineWarningTasklet implements Tasklet{
	
	@Autowired
	private BookingManager bookingManager;	
	@Autowired
	private BookManager bookManager;	
	@Autowired
	private UserManager userManager;	
	@Autowired
	private MailToSend mailToSend;
	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		List<Booking> bookingList = bookingManager.getAllBooking();
		List<Booking> bookingListWithEndingDate = bookingList.stream().filter(booking -> booking.getAlertDate() != null).collect(Collectors.toList());
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
        XMLGregorianCalendar now = 
            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
		
		bookingListWithEndingDate.forEach(booking -> {
			if (booking.getAlertDate().compare(now) < 0) {
				System.out.println("On y passe roroya");
				
				Book book  = (Book) bookManager.bookResearch(booking.getBookTitle()).keySet().toArray()[0];
				User user = userManager.getUserById(booking.getUserId());				
				mailToSend.sendDeadLineWarningMail(user.getEmail(), user.getFirstName(), user.getLastName(), book.getTitle());
				bookingManager.deleteBooking(book.getTitle(), user.getId());
				
				bookingManager.addAlertDate(book.getTitle());				
				User user2 = getfirstPositionUserForBooking(book.getTitle());
				mailToSend.sendAvailableBookingMessage(user2.getEmail(), user2.getFirstName(), user2.getLastName(), book.getTitle());
			}
		});
		
		return RepeatStatus.FINISHED;
	}
	
	public User getfirstPositionUserForBooking(String bookTitle) {
		
		List<Booking> bookingList = bookingManager.getAllBooking();
		
		Integer userId = bookingList.stream().filter( booking -> booking.getBookTitle().equals(bookTitle) && booking.getPosition() == 1)
				.findAny().get().getUserId();
		
		User user = userManager.getUserById(userId);
		return user;
	}

}
