package com.Q1;

public interface Y {
void method1();
	
	public default void  method2() {
		System.out.println("inside method2 of Y");
	}
	
	public static void method3() {
		System.out.println("inside method3 of Y");
	}

}
