package com.inheritance.superkey;

public class Student extends Person {
     
	String name="harshitha";
      String course="BCA";
    
       Student() {
    	 
    	  super();
    	  System.out.println("the name of a student is : " + name );
    	  System.out.println("the course of a student is : " + course );
    	  System.out.println("the city of a person live in : " + city );
      }
       public void display() {
    	 
    	 super.display();
    	  System.out.println("the name of a student is : " + name );
    	  System.out.println("the course of a student is : " + course );
      }
  
}