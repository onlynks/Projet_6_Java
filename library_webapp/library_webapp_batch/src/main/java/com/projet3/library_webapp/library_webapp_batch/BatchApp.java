package com.projet3.library_webapp.library_webapp_batch;

import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BatchApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/batchContext.xml");
	    BatchLauncher launcher = (BatchLauncher) context.getBean(BatchLauncher.class);
	    try {
			launcher.run();
		} catch (JobRestartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	 }

}
