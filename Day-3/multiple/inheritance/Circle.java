package com.multiple.inheritance;

public class Circle extends Triangle {
  
	   double pi=3.14;
	   int r=6;
	   double a= pi*r*r;
	   
	public void area() {
		
		System.out.println("Area of Circle is : " + a);
		
	}
}
