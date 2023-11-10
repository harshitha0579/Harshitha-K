package com.java8and9;

public class Calculatearea implements Shapearea{

	
	@Override
	public void squarearea(int a) {
	System.out.println("area of square inside abstract method is " +(a*a));
		
	}
	public static void main(String args[])
	{
		Shapearea area=new Calculatearea();
		area.squarearea(4);
		area.circlearea(2, 6, 2);
		
	}

	
}
