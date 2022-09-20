package com.Q2;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of Rows");
		int n=sc.nextInt();
		
		System.out.println("Enter the no. of Columns");
		int m=sc.nextInt();
		
		int arr[][]=new int[n][m];
					
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<m; j++) {
				System.out.println("enter the"+" "+ (j+1) +" element of"+" "+ (i+1) +" row");
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int a=0; a<arr[0].length; a++) {
			int sum=0;
			for(int b=0; b<arr.length; b++) {
				if(arr[b][a]%2==0) {
					sum=sum+arr[b][a];
				}
			}
			System.out.println("The Result is " +sum);
			
		}
		
	}

}

