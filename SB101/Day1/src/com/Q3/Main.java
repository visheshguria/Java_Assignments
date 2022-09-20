package com.Q3;

public class Main {
	public static void main(String[] args) {
	Library book=new Library();
	book.add(new Books(10,"Spirit","William Shakespeare"));
	book.add(new Books(1,"Spirit","William Shakespeare"));
	book.add(new Books(1,"Spirit","William Shakespeare"));
	
	book.add(new Books(8,"Spirit","William Shakespeare"));
	book.add(new Books(2,"how a man thinks","Pikasho"));


	book.showBook();
		
		System.out.println("Details of members==========================");
		System.out.println();
		System.out.println();
		System.out.println("==================================================");
	book.add(new Members(1, "ramesh", 24, "12/12/2022"));
	book.add(new Members(2, "ramesh", 4, "30/12/2022"));
	book.add(new Members(1, "ramesh", 34, "12/12/2022"));
	book.add(new Members(6, "ramesh", 4, "30/12/2022"));
	book.add(new Members(4, "ramesh", 4, "03/11/2022"));
	book.showMembers();
	
	}
}
