package com.Q4;

public class Main {
	
	void printNumber(double n) {
		 if(n<0) {
			System.out.println("Error!");
		}
		
		 else if(n%2!=0) {
			System.out.println("Output is: " +n);
		}
		
		else if(n%2==0) {
			n=Math.floor(n/10);
			n=n+1;
			n=n*10;
			System.out.println("Output is: " +n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj= new Main();
		
		obj.printNumber(24);

	}

}
