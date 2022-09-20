package com.Q1;

public interface X {

	void fun1();
	
	public default void fun2() {
		System.out.println("inside fun2 of X");
	}
	
	
	public static void fun3() {
		System.out.println("inside fun3 of X");
	}

}
