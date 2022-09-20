package com.Q3;

import java.util.Scanner;

public class Ticket {

	int ticketid;
	int price;
	static int availableTickets;

	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}


	public int calculateTicketCost(int noOfTickets) {
		int total=0;
		if(availableTickets>0) {
			availableTickets=availableTickets-noOfTickets;

			total=noOfTickets*this.price;
			return total;
		}else {
			return -1;
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of booking");
		Scanner sc= new Scanner(System.in);

		int size=sc.nextInt();

		System.out.println("Enter Available tickets");


		int ticket=sc.nextInt();
		availableTickets=ticket;


		for(int i=0;i<size;i++) {

			System.out.println("Enter ticket id");
			int ticketid=sc.nextInt();
			System.out.println("Enter the price");
			int price=sc.nextInt();
			System.out.println("Enter no of tickets");
			int number=sc.nextInt();


			Ticket obj=new Ticket(ticketid,price);

			System.out.println("Available tickets:"+availableTickets);
			int a=obj.calculateTicketCost(number);
			System.out.println("Total amount:"+a);
			System.out.println("Available ticket after booking:"+availableTickets);

		}
	}
}
