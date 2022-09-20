package com.Q6;
import java.util.*;

public class CommerceStudent implements Student{
	
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;
	
	
	
	
	public int getAccountMarks() {
		return accountMarks;
	}




	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}




	public int getEconomicsMarks() {
		return economicsMarks;
	}




	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}




	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}




	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}




	@Override
	public double findPercentage( ){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter account marks");
		 this.accountMarks= sc.nextInt();
		 
		 System.out.println("Enter ecnomics marks");
		 this.economicsMarks= sc.nextInt();
		 
		 System.out.println("Enter business marks");
		 this.businessStudiesMarks= sc.nextInt();
		
		int total;
		total = this.accountMarks+ this.businessStudiesMarks+ this.economicsMarks;
		
		return total/3;	
	}

}
