package com.Q2;
import java.util.*;
public class StudentComp implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.marks>o2.marks?1:-1;
	}	
}
