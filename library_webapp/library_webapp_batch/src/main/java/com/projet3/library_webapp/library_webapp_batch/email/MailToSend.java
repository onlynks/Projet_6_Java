package com.projet3.library_webapp.library_webapp_batch.email;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailToSend {
	
	@Autowired
	EmailAPI emailSender;

	public void sendMail(String email, String firstName, String lastName, Map<String,String> lateBook) {
	
		String toAddr = email;
		String fromAddr = "dev.adress.12@gmail.com";
 
		String subject = "Biboliothèque de Paris: emprunts en retard";

		String bookRows = null;
		
		for(Map.Entry<String,String>entry : lateBook.entrySet()) {
			 bookRows += "<tr>"
					+ "<td>" + entry.getKey()
					+ "<td>" + entry.getValue()
					+ "</tr>";
		}
				
		String body = "Bonjour" + firstName + " " + lastName + "\n" 
				+ "Voici la liste de vos emprunts en retard:"
				+ "<table>"
				+ "<tr>"
				+ "<td>&nbsp;</td>"
				+ "<td>Titre</td>"
				+ "<td>Date de retour</td>"
				+ "</tr>"
				+ bookRows;	
				
				
		emailSender.readyToSendEmail(toAddr, fromAddr, subject, body);
	}

}
