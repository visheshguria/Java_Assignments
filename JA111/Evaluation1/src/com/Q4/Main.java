/*Q4) Write a Java class with a static method that will take 5 positive numbers as a parameter which will represent:
1s, 2s, 3s, fours and sixes scored by the batsman.*/

package com.Q4;

public class Main {
	
	public static void runScored(int one, int two, int three, int four ,int six) {
		int sum=0;
		
		sum= (one*1)+ (two*2)+(three*3)+(four*4)+(six*6);
		
		System.out.println("Total Scores Scored by Batsman Are: "+ sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runScored(3,2,1,1,1);

	}

}
