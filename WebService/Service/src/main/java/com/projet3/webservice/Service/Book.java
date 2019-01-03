package com.projet3.webservice.Service;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.projet3.webservice.Business.impl.ManagerFactoryImpl;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService
public class Book {
	
	private ManagerFactoryImpl managerFactory;	

/*	
	public static void main(String[] args) throws SQLException {

		ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		
		ManagerFactoryImpl Factory = ApplicationContext.getBean("managerFactory", ManagerFactoryImpl.class);
		String description = Factory.getBookManager().getBook("Le petit cheval de manège");
		
		System.out.println( description);
		System.out.println( "works");
		//Endpoint.publish("http://localhost:8082/service", new BookService());
	}
*/
	@WebMethod
	public String getDescription(String title) throws SQLException {
		String description = managerFactory.getBookManager().getBook(title);
		return description;
	}
	
	@WebMethod(exclude = true)
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}

	@WebMethod(exclude = true)
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

}