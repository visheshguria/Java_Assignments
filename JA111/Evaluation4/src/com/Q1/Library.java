package com.Q1;

import java.util.TreeSet;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> booksCollection = new TreeSet <> (new com.Q1.Compare());
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		//Implement the logic to iterate through the collection and print the books
		
		for(Book bookobj : booksCollection) {
			System.out.println("{ BookId: " + bookobj.getBookId() + " , " + "bookName: " + bookobj.getBookName() + " , " + "author : " + bookobj.getAuthor()+" } " );
		}
	
	}

}
