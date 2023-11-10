package com.java8and9;

public interface Shapearea {

	void squarearea(int a);
	
	public default void circlearea(int r,int b,int l) {
		System.out.println("Area of circle inside default is " +(3.14*r*r));
		rectanglearea(l, b);
		trianglearea(b, l);
		
	}
	
	private void rectanglearea(int b,int l) {
		System.out.println("Area of rectangle inside private is " +(l*b));
	}
	
	private static void trianglearea(int b , int l) {
		System.out.println("Area of triangle inside private static is " +((b*l)/2));
	}
	
}
