package com.Q3;
import java.util.Iterator;
import java.util.TreeSet;

public class Library {	
	
	TreeSet<Books> books= new TreeSet<>(new BooksComp());
	TreeSet<Members> members= new TreeSet<>(new MembersComp());
	 void add(Books book) {
		 
		 books.add(book);

	 }
 void add(Members m) {
		 
		 members.add(m);

	 }
	 void showBook() {
		 Iterator<Books> cob=books.iterator();
		 while(cob.hasNext()) {
			 System.out.println(cob.next());
		 }
	 }
	 
	 
	 void showMembers() {
		 Iterator<Members> m=members.iterator();
		 while(m.hasNext()) {
			 System.out.println(m.next());
		 }
	 }
}

