package com.staticDemo;

public class calculation {
	
	   int a;
	   int b;
	
	   calculation()
	{
		  
		  System.out.println("inside constructor ");
		   
	   }
	  
	public static void add(int a,int b)
	{
		System.out.println("inside static  method");
		System.out.println("addition of " +a+ " and " +b+ " is " +(a+b));
		   
	   }
	
	static {
		System.out.println("inside static block");
		
	}
	
	public static void main(String args[]) {
		calculation c1=new calculation();
		System.out.println("inside main block");
		c1.add(20 ,30);
		
	}
}
