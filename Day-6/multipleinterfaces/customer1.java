package com.multipleinterfaces;

public class customer1 implements bike1{

	@Override
	public void carspeed() {

       int speed=150;
		System.out.println("car is moving with the speed of " +speed);
	}

	@Override
	public void bikespeed() {
		 
		int speed=100;
		System.out.println("bike is moving with the speed of " +speed);
		
	}

	 public static void main(String args[]) {
		 customer1 c1=new customer1();
		 c1.bikespeed();
		 c1.carspeed();
	 }
}
