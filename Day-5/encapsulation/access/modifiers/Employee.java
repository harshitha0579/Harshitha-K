package com.encapsulation.access.modifiers;

public class Employee {

	private int Eid;
	public String name;
    protected String deptname;
	protected String loc;
	
	protected void display() {
		System.out.println("Protected can be accessed within a package or it can be accessed outside with child class only");
	}
	
	public int getEid() {
		return Eid;
	}
	
	public void setEid(int Eid) {
		this.Eid = Eid;
	}
	
	
}
