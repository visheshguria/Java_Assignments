package com.Q4;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		  Library NewLibrary = new Library();
		  Book NewBook = new Book();
		  
		  int Choice;
		  System.out.println("Enter your choice: ");
		  Choice = sc.nextInt();
		  
		  while(Choice!=5) {
			  
			  if(Choice==1){
				  System.out.println("Enter the isbn no: ");
				  int Isbn=sc.nextInt();
				  
				  System.out.println("Enter the book name:");
				  String bookName=sc.next();
				  sc.nextLine();
				  
				  System.out.println("Enter the author name:");
				  String authorName = sc.nextLine();
				  
				  NewBook.setIsbn(Isbn);
				  NewBook.setBookName(bookName);
				  NewBook.setAuthor(authorName);
				  
				  Book NewBook1 = new Book(Isbn,bookName,authorName);
				  NewLibrary.addBook(NewBook1);
				  
				  System.out.println("Book added successfully");
				  
			  }else if(Choice==2) {
		    	  
			      List<Book> book=NewLibrary.viewAllBooks();
			       
					  for(Book j: book) {
		
							System.out.println("Author is :"+j.getAuthor());
							System.out.println("Name is :"+j.getBookName());
							System.out.println("isbn is :"+j.getIsbn());
							System.out.println("===============================");
					  }
					  
		      }else if(Choice==3) {
		    	  
			      System.out.println("Enter the author Name");  
			      sc.nextLine();
			      String authorName = sc.nextLine();
			      
			      List<Book> book = NewLibrary.viewBooksByAuthor(authorName);
			     
				  if(book.size()!=0)
			        for(Book student: book) {

				            System.out.println("isbn is :"+student.getIsbn());
				            System.out.println("Name is :"+student.getBookName());
				            System.out.println("Author is :"+student.getAuthor());
							System.out.println("================================");

			       } 
			  }else if(Choice==4) {
				  
				 System.out.println("Book Name");
				 String BookName=sc.next();
				 sc.nextLine();
				 
				 System.out.println(NewLibrary.countNoOfBook(BookName));

			  }
			  
			  System.out.println("Enter your choice: ");
			  Choice = sc.nextInt();
		  }
		  
		  if(Choice==5) {
		      System.out.println("Thank You...!!");
			    return;
		  }
	}

	
}
