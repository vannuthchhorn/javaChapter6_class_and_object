package Chapter5.Homework1;

import java.util.ArrayList;

public class Student {
	
	
	private String firstName;
	private String batch;
	private ArrayList<Book> bookCart;
	
	public Student(String firstName,String batch) {
		this.firstName = firstName;
		this.batch = batch;
		bookCart = new ArrayList<Book>();		
	}
	
	public void borrowBook(Book book) {
		
		//check if bookCart has 3 books or not
			//if has already 3 books doesn't allow to borrow		
			//if doesn't have 3 books then allow to borrow
			//check if the book is available or not
			//if this book is available we will add the book into cart
				//add book to cart				
				//mark that book as borrowed
			
		
	}
	
	public void returnBook(Book book) {
		//check if this book is in the cart
			//this book is in the cart
			
				//mark this book as available 
			
				//remove this book from cart		
			
			//this book isn't in the cart
		
	}
	
	public ArrayList<Book> getBookCart(){
		return bookCart;
	}

	public String toString() {
		String output = "";
		//write your string concatenation here
		return output;
	}
}
