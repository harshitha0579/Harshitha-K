package com.encapsulation.access.modifiers;

public class MAIN {
   public static void main(String args[]) {
	 
	    Employee e1 = new Employee();
	    e1.name="Harshitha";
	    e1.setEid(123);
	    e1.deptname="java full Stack";
	    e1.loc="bangalore";
	    
	    System.out.println("Name of employee : " + e1.name );
	    System.out.println("ID  of employee : " + e1.getEid() );
	    System.out.println("department of employee : " + e1.deptname );
	    System.out.println("location of employee : " + e1.loc );
	    
	    
}
}
