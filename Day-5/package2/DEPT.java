package com.package2;


import com.encapsulation.access.modifiers.Employee;

 public class DEPT extends Employee {
   
	 public static void main(String args[])
   {
	   DEPT d1 = new DEPT();
	   d1.display();
	   d1.name="harsh";
	   d1.deptname="jfsdevelop";
	   d1.loc="mysore";
	   System.out.println("name of dept class is : " + d1.name );
	   System.out.println("dept name of dept class is : " + d1.deptname );
	   System.out.println("location of dept class is : " + d1.loc );
   }
}
