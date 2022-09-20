package com.Q5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {
		public static void main (String[] args) throws Exception {
			
			ObjectInputStream oi= new ObjectInputStream(new FileInputStream("d://students.txt"));
			
			Object o= oi.readObject();
			
			List<Student> lst= (List<Student>) o;
			
			lst.forEach(l-> System.out.println(l));
			oi.close();		
		}
}
