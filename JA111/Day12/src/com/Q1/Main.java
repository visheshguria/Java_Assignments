package com.Q1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Z obj = new Zimpl();
		
		obj.fun1();//fun1 of X interface
		obj.fun2();// fun2 of X interface
		X.fun3();//fun3 of X interface
		
		obj.method1();// fun1 of Y interface
		obj.method2();// fun2 of Y interface
		Y.method3();// fun3 of Y interface
		
		obj.zFun();// fun of interface Z

		
	}


}
