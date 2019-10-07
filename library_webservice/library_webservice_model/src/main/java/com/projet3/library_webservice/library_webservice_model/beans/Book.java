package com.projet3.library_webservice.library_webservice_model.beans;

public class Book {
	
	
	private int id;
	private String title;
	private String description;
	private Boolean available;
	private Author author;
	private Publisher publisher;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", available=" + available
				+ ", author=" + author + ", publisher=" + publisher + "]";
	}

}