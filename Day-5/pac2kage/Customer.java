package com.pac2kage;

import com.package1.Account;

public class Customer extends Account {
	public static void main(String args[])
	{
		Customer cm=new Customer();
		cm.info();
		cm.loc="mysore";
		cm.address="sunkadakatte";
		cm.setAccno(123);
		cm.setIfsccode("canara123");
		System.out.println("customer account number : " + cm.getAccno() );
		System.out.println("customer IFSC code : " + cm.getIfsccode() );
		System.out.println("customer location : " + cm.loc );
		System.out.println("customer address : " + cm.address );
	}

}
