package com.Q3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Members {
	int memberId;
	String memberName;
	int membershipNo;
	LocalDate membershipEnddate;
	public Members(int memberId, String memberName, int membershipNo, String dob) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		membershipEnddate=LocalDate.parse(dob,dtf);
		
	}
	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}
	
	

}
