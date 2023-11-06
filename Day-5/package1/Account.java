package com.package1;

public class Account {
 
	  private int accno;
	  private String ifsccode;
	  protected String loc;
	  protected String address;
	  double amount=9000.76;

	
	  public int getAccno() {
		return accno;
	}
	
	  public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	  
	protected void info() {
		
		System.out.println(" inside protected.....");
		System.out.println(" amount : " + amount );
	}
	  
}
