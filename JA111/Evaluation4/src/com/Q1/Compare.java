package com.Q1;
import java.util.Comparator;
public class Compare  implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		if(b1.getBookId() > b2.getBookId()) {
			return 1;
		}
		else if( b1.getBookId() < b2.getBookId()) {
			return -1;
		}
		else
		return 0;
	}
		
}
