package com.multipleinterfaces;

public class Customer implements Bike,Car{

	@Override
	public void car() {
		
		String colour="blue";
		System.out.println("Car has 4 wheels and colour is  " +colour);
		
	}

	@Override
	public void bike() {
		
		String colour="red";
		System.out.println("BIke has 2 wheels and colour is " + colour );
	}

	public static void main(String args[]) {
		Customer c = new Customer();
		c.bike();
		c.car();
	}
}
