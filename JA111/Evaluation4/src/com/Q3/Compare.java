package com.Q3;

import java.util.Comparator;

public class Compare implements Comparator <Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		
		int mark1= s1.getEngMarks()+ s1.getMathsMarks()+ s1.getScienceMarks();
		int mark2= s2.getEngMarks()+s2.getMathsMarks()+s2.getScienceMarks();
		
		if(mark1>mark2) {
			return -1;
		}
		else if(mark1<mark2) {
			return 1;
		}
		
		
		
		else {
			
			int a = s1.getName().compareTo(s2.getName());
			if(a==1) {
				return -1;
			}
			else if (a== -1) {
				return 1;
			}
			
			
			
			else {
				
				int r1=  s1.getRollNo();
				int r2= s2.getRollNo();
				
				if(r1>r2) {
					return 1;
				}
				else if (r1<r2) {
					return -1;
				}
				else return 0;
				
			}
		}
		
	}
		
}

