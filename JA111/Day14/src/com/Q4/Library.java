package com.Q4;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> bookList=new ArrayList<>();
	
	
	void addBook(Book book) {
		bookList.add(book);
	}
	
	 boolean isEmpty() {
		 if(bookList.size()==0)
			 return true;
		 
		 return false;
	 }
	 
	 List<Book> viewAllBooks(){
		 
		 return bookList;
	 }
	 
	 
	 List<Book> viewBooksByAuthor(String author){
		 
		 List<Book> MatchAuthor = new ArrayList<>();
		 
		 for(Book j: bookList) 
		 if(j.getAuthor().equals(author))
		 MatchAuthor.add(j);
		
		 if(MatchAuthor.size()==0)
			 System.out.println("None of the book published by the author"+ author);
		 return MatchAuthor;
		 
	 }
	 
	 int countNoOfBook(String bookName) {
		 
		 int count=0;
		 
		 for(Book i: bookList) 
		 if(i.getBookName().equals(bookName))				
	     count++;
		 
		 return count;
		 
	 }
}
