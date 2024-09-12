package com.regular;

public class Book {
	String name,author,publisher;
	int quantity;
	int id;
	public Book(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity; 
	}
}
