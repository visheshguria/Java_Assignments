package com.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex= Executors.newFixedThreadPool(3);
		List<Integer> l= Arrays.asList(4,5,3,2,10,6);
		
		for(int i: l) {
			Future<Long> res= ex.submit(new Call(i));
			
			try {
				System.out.println(res.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		ex.shutdown();
	}

}
