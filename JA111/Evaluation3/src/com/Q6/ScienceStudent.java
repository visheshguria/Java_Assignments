package com.Q6;

import java.util.Scanner;

public class ScienceStudent implements Student {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	private int biologyMarks;
	
	
	public int getPhysicsMarks() {
		return physicsMarks;
	}


	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}


	public int getChemistryMarks() {
		return chemistryMarks;
	}


	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}


	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}


	public int getBiologyMarks() {
		return biologyMarks;
	}


	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}


	@Override
	public double findPercentage( ){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter biology marks");
		 this.biologyMarks= sc.nextInt();
		 
		 System.out.println("Enter chemistry marks");
		 this.chemistryMarks= sc.nextInt();
		 
		 System.out.println("Enter physics marks");
		 this.physicsMarks= sc.nextInt();
		 
		 System.out.println("Enter maths marks");
		 this.mathsMarks= sc.nextInt();
		
		int total;
		total =this.biologyMarks + this.chemistryMarks+ this.mathsMarks + this.physicsMarks;
		
		return total/4;	
	}

}
