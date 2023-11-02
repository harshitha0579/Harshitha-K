package com.single.inheritance;

public class Triangle extends Shape {
	int b=1200;
	int h=300;
	float a=(b*h)/2;
	public void area() {
		
		System.out.println("Area of Triangle is " + a);
		
	}

}
