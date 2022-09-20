package com.Q6;

import java.util.Scanner;

public class ArtStudent implements Student {
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	
	public int getHindiMarks() {
		return hindiMarks;
	}
	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}
	public int getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}
	public int getHistoryMarks() {
		return historyMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}
	
	
	@Override
	public double findPercentage( ){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter English marks");
		 this.englishMarks= sc.nextInt();
		 
		 System.out.println("Enter hindi marks");
		 this.hindiMarks= sc.nextInt();
		 
		 System.out.println("Enter history marks");
		 this.historyMarks= sc.nextInt();

		int total;
		total =this.englishMarks + this.hindiMarks+  this.historyMarks;
		
		return total/3;	
	}
}
