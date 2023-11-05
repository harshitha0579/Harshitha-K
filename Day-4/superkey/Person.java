package com.inheritance.superkey;

public class Person {
	
	String city="bangalore";
	int uniqueid=1234;
	
     Person() {
	System.out.println("the unique id of a person is : " + uniqueid );
    
    }
    public void display() {
    	
    	System.out.println("the unique id of a person is : " + uniqueid );
    	System.out.println("the city of a person live in : " + city );
    }
}
