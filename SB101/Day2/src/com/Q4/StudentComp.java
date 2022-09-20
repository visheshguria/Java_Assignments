package com.Q4;

import java.util.Comparator;

public class StudentComp implements  Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getMarks()>s2.getMarks()? 1:0;
	}

}
