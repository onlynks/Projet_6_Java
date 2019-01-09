package com.projet3.webservice.Consumer.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractDAO {
	
	@Autowired
	protected DataSource dataSource;
	
	@Autowired
	protected JdbcTemplate template;
}
