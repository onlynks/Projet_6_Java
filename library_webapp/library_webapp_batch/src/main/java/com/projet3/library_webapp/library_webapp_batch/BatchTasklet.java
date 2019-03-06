package com.projet3.library_webapp.library_webapp_batch;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projet3.library_webapp.library_webapp_batch.email.MailToSend;
import com.projet3.library_webapp.library_webapp_business.interfaces.BookManager;
import com.projet3.library_webapp.library_webapp_model.book.Borrowing;
import com.projet3.library_webapp.library_webapp_model.user.User;

@Component
public class BatchTasklet implements Tasklet{
	
	@Autowired
	private BookManager bookManager;
	
	@Autowired
	private MailToSend mailToSend;

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		Map<User, List<Borrowing>> userWithLateBorrowing = bookManager.getLateBorrowing();
		
		for(Entry<User, List<Borrowing>> e : userWithLateBorrowing.entrySet()) {
			
			String email = e.getKey().getEmail();
			String firstName = e.getKey().getFirstName();
			String lastName = e.getKey().getLastName();
			Map<String,String> lateBook = new HashMap<String,String>();
			
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			
			for(Borrowing borrowing : e.getValue()) {
				String title  = borrowing.getBook().getTitle();
				
				String date = formatter.format(borrowing.getEndingDate().toGregorianCalendar().getTime());
				
				lateBook.put(title, date);
			}
					
			mailToSend.sendMail(email, firstName, lastName, lateBook);			
	             
	    }
		return RepeatStatus.FINISHED;
	}

}
