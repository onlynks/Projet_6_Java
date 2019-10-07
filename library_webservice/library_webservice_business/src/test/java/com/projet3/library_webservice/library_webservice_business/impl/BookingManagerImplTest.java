package com.projet3.library_webservice.library_webservice_business.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;

import com.projet3.library_webservice.library_webservice_business.utils.BookUtils;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookDAO;
import com.projet3.library_webservice.library_webservice_consumer.DAO.BookingDAO;
import com.projet3.library_webservice.library_webservice_model.beans.Book;

@ExtendWith(MockitoExtension.class)
class BookingManagerImplTest {

	@InjectMocks
	private BookingManagerImpl bookingManager;
	@Mock
	private BookingDAO bookingDAO;
	@Mock
	private BookDAO bookDAO;
	
	
	@Test
	void createBookingNoBookTest() {
		try {
			Mockito.when(bookDAO.bookResearch(Mockito.any(String.class))).thenReturn(Collections.emptyList());
			
			Exception thrown = Assertions.assertThrows(Exception.class, () -> bookingManager.createBooking(1, "test"));			
			Assertions.assertTrue(thrown.getMessage().contains("01"));
		} catch (SQLException e) {
			
		}
	}
	
	@Test
	void createBookingStillAvailableTest() throws IOException {
		try {
			Mockito.when(bookDAO.bookResearch(Mockito.any(String.class)))
			.thenReturn(Collections.singletonList(BookUtils.getBook("Les Misérables")));
			
			Exception thrown = Assertions.assertThrows(Exception.class, () -> bookingManager.createBooking(1, "test"));			
			Assertions.assertTrue(thrown.getMessage().contains("02"));
		} catch (SQLException e) {
			
		}
	}
	
	@Test
	void createBookingAlreadyBookedTest() {
		try {
			Book book = BookUtils.getBook("Les Misérables");
			book.setAvailable(false);
			
			Mockito.when(bookDAO.bookResearch(Mockito.any(String.class)))
			.thenReturn(Collections.singletonList(book));
			Mockito.when(bookingDAO.getBookingListByTitle(Mockito.any(String.class))).thenReturn(BookUtils.getBooking());
			
			Exception thrown1 = Assertions.assertThrows(Exception.class, () -> bookingManager.createBooking(1, "test"));			
			Assertions.assertTrue(thrown1.getMessage().contains("03"));
			
			Exception thrown2 = Assertions.assertThrows(Exception.class, () -> bookingManager.createBooking(99, "test"));			
			Assertions.assertTrue(thrown2.getMessage().contains("04"));
		} catch (SQLException | IOException e) {
			
		}
	}
	
	@Test
	void createBookingTest() throws IOException {
		try {
			List<Book> bookList = BookUtils.getBookListByTitle("Les Misérables");
			bookList.forEach( book -> book.setAvailable(false));
			
			Mockito.when(bookDAO.bookResearch(Mockito.any(String.class)))
			.thenReturn(bookList);
			
			Mockito.when(bookingDAO.getBookingListByTitle(Mockito.any(String.class))).thenReturn(BookUtils.getBooking());
			
			Assertions.assertDoesNotThrow( () -> bookingManager.createBooking(99, "test"));
		} catch (SQLException e) {
			
		}
	}
	
	
	
	
	

}
