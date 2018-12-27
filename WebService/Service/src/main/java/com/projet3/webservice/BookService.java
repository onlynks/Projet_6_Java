package com.projet3.webservice;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.Business.impl.ManagerFactoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService(serviceName = "BookService")
public class BookService {
	
	private ManagerFactoryImpl managerFactory;	

	public static void main(String[] args) throws SQLException {
		/*
		BookManagerImpl manager = new BookManagerImpl();
		String description = manager.getBook("Le petit cheval de manège");		
		*/
		ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		
		ManagerFactoryImpl Factory = ApplicationContext.getBean("managerFactory", ManagerFactoryImpl.class);
		String description = Factory.getBookManager().getBook("Le petit cheval de manège");
		System.out.println( description);
	}
	
	@WebMethod
	public String getDescription(String title) throws SQLException {
		//BookManagerImpl manager = new BookManagerImpl();
		//String description = manager.getBook(title);
		String description = managerFactory.getBookManager().getBook(title);
		return description;
	}
	
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}

	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

}
