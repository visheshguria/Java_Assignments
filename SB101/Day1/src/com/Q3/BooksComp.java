package com.Q3;
import java.util.Comparator;
public class BooksComp implements Comparator<Books> {
	

		@Override
		public int compare(Books o1, Books o2) {
			if(o1.bookId==o2.bookId)return 0;
		else if(o1.bookId>o2.bookId)return 1;
			
			else
				return -1;

		}

}	


