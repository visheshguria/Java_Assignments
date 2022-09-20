package com.Q4;

public class Parent {
	final int number;

	public void method1() {
		
		System.out.println("number is "+number);	
		System.out.println("Inside method1 of Parent Class");
		Parent parentobj=new Parent(7);
		parentobj.method2();	
	}
	
    private void method2(){
    	System.out.println("Inside method2 of Parent Class");
	}

    protected void method3(){
    	System.out.println("Inside method3 of Parent Class");
    	
    	Child childobj=new Child(7);
    	childobj.method4();
    }
    
	public Parent(int number){
		
		this.number = number;
		
	}

}
