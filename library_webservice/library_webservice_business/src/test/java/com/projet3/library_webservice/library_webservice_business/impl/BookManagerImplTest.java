package com.projet3.library_webservice.library_webservice_business.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.projet3.library_webservice.library_webservice_business.utils.BookUtils;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BorrowingDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.UserDAO;

@ExtendWith(MockitoExtension.class)
class BookManagerImplTest {
	@InjectMocks
	private BookManagerImpl bookManager;	
	@Mock
	private BookDAO bookDAO;	
	@Mock
	private BorrowingDAO borrowingDAO;	
	@Mock
	private UserDAO userDAO;

	@Test
	void getNextBookReturnTest() throws SQLException, IOException {
		Mockito.when(bookDAO.getBookByTitle(Mockito.anyString())).thenReturn(BookUtils.getBookListByTitle("Les Misérables"));		
		Mockito.when(borrowingDAO.getBorrowingsById(Mockito.anyList())).thenReturn(BookUtils.getBorrowingList());
		
		Assertions.assertTrue(bookManager.getNextBookReturn(Mockito.anyString()).compareTo(new Date(new Long(1570041580))) == 0);
	}

}
