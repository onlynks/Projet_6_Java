package com.projet3.webservice.Service;

import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.projet3.webservice.Business.impl.ManagerFactoryImpl;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebService
public class Book {
	
	private static ManagerFactoryImpl managerFactory;	

	/*
	public static void main(String[] args) throws SQLException {

		ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		
		ManagerFactoryImpl Factory = ApplicationContext.getBean("managerFactory", ManagerFactoryImpl.class);
		String description = Factory.getBookManager().getBook("Tintin");
		
		System.out.println( description);
		System.out.println( "works");
		//Endpoint.publish("http://localhost:8082/service", new BookService());
	}
	*/

	@WebMethod
	public String getDescription(String title) {
		
		String description = null;
		try {
			description = managerFactory.getBookManager().getBook("Tintin");
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (NullPointerException e) {
			return e.getStackTrace().toString();
		}
		
		
		//String truc = (managerFactory.getBookManager() == null) ? "bah oui" : "et non!";
			
		return description;
	}
	
	
	@WebMethod(exclude = true)
	public static ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}

	@WebMethod(exclude = true)
	public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
		Book.managerFactory = managerFactory;
	}
	

}