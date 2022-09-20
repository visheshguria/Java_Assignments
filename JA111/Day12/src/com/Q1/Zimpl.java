package com.Q1;

public class Zimpl implements Z{
	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("inside fun1 of X");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("inside fun1 of Y");
	}

	@Override
	public void zFun() {
		// TODO Auto-generated method stub
		System.out.println("inside zFun of Z");
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
	//	Z.super.fun2();
		
		System.out.println("inside fun2 of X overridden");
	}

}
