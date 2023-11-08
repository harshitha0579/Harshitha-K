package com.interfaces;

public class Loan implements Bank {

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("loan amount has been credited");
	
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("loan amount has been debited");
	}

	public static void main(String args[]) {
		Loan l1=new Loan();
		l1.credit();
		l1.debit();
	}
}
