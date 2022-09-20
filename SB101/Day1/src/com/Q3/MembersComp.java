package com.Q3;


import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class MembersComp implements Comparator<Members> {
LocalDate ld=LocalDate.now();
	@Override
	public int compare(Members o1, Members o2) {
		Period p1=Period.between(ld, o1.membershipEnddate);
		Period p2=Period.between(ld, o2.membershipEnddate);
		if(o1.memberId==o2.memberId||o1.membershipNo==o2.membershipNo)return 0;
		
		else if(p1.getDays()>p2.getDays())return 1;
		else return -1;
	}

}
