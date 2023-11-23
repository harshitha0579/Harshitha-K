package com.StringDemo;

public class StringEx {

	public static void main(String[] args) {


		String s1="          Hello   ";
		String s2=new String("Welcome");
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		String s4="java";
		String s6="this is a String program";
		//charAt
		for(int i=0;i<s4.length();i++);
		{
		 
			System.out.println("Java at first index " +s4.charAt(0));
			System.out.println("Java at last index " +s4.charAt(s4.length() - 1));
	    }
		//length
		System.out.println("Length of a string JAVA is  " +s4.length());
		
		//substring
		System.out.println(s4.substring(1));
		System.out.println(s4.substring(1,3));
		System.out.println(s3.contains("Hello"));
		
		//print index of
		System.out.println(s4.indexOf("v"));
		System.out.println(s4.indexOf("a",2));
		System.out.println(s6.indexOf("is"));
		
		//upper case and lower case converting
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//trim the whitespace at  beginning and ending of a string
		System.out.println(s1.trim());
		
	//static string join
	   String s5=String.join(":","Java", "Full Stack","Developer");
	   System.out.println(s5);
	   
	   //split
	   String str="ge4eks@#4dgj4gd";
	   String[] s7=str.split("4");
	   for(String i:s7)
	   System.out.println(i);
	   
	   //replace
	  String  s8=s6.replace("s", "e**");
	   System.out.println("Replaced string is  " +s8);
	 
	}


}
