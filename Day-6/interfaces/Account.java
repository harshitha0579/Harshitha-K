package com.interfaces;

public class Account implements Bank {

	
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("$1000 is credited");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("$500 is debited");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Account a1 = new Account();
        
         a1.credit();
         a1.debit();
	}


}
