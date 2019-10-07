package com.projet3.library_webservice.library_webservice_business.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.ByteSource;
import com.projet3.library_webservice.library_webservice_model.beans.Author;
import com.projet3.library_webservice.library_webservice_model.beans.Book;
import com.projet3.library_webservice.library_webservice_model.beans.Booking;
import com.projet3.library_webservice.library_webservice_model.beans.Borrowing;
import com.projet3.library_webservice.library_webservice_model.beans.Publisher;

public class BookUtils {
	
	
	public static List<Book> getBookList() throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("books.txt");
		
		ByteSource byteSource = new ByteSource() {
            @Override
            public InputStream openStream() throws IOException {
                return is;
            }
        };
        
        String text = byteSource.asCharSource(Charsets.UTF_8).read();
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(text, new TypeReference<List<Book>>(){});
	}
	
	public static List<Book> getBookListByTitle(String bookTitle) throws IOException {
		return getBookList().stream().filter( book -> book.getTitle().equals(bookTitle)).collect(Collectors.toList());
	}
	
	public static List<Booking> getBooking() throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("bookings.txt");
		
		ByteSource byteSource = new ByteSource() {
            @Override
            public InputStream openStream() throws IOException {
                return is;
            }
        };
        
        String text = byteSource.asCharSource(Charsets.UTF_8).read();
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(text, new TypeReference<List<Booking>>(){});
	}
	
	public static List<Booking> getBookingListByTitle(String bookTitle) throws IOException {
		return getBooking().stream().filter( book -> book.getBookTitle().equals(bookTitle)).collect(Collectors.toList());
	}
	
	public static Book getBook(String bookTitle) throws IOException {
		
		return getBookList().stream().filter( book -> book.getTitle().equals(bookTitle)).findFirst().get();

	}
	
	public static List<Borrowing> getBorrowingList() throws IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("borrowing.txt");
		
		ByteSource byteSource = new ByteSource() {
            @Override
            public InputStream openStream() throws IOException {
                return is;
            }
        };
        
        String text = byteSource.asCharSource(Charsets.UTF_8).read();
        
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(text, new TypeReference<List<Borrowing>>(){});
	}
	
	public static Author getAuthor() {
		Author author = new Author();
		author.setId(1);
		author.setFirstName("Juste");
		author.setLastName("Leblanc");
		author.setBirthDate(new Date());
		author.setDeathDate(null);
		author.setDescription("Un ami fidèle");
		
		return author;
	}
	
	public static Publisher getPublisher() {
		Publisher publisher = new Publisher();
		publisher.setId(1);
		publisher.setName("Les éditeurs du plat pays");
		return publisher;
	}

}
