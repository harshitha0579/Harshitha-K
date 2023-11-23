package com.StringDemo;

public class Stringcompare {

	/*
	 * if s1>s2 return positive number
	 * if s1<s2 return negative number
	 * if s1==s2 return 0
	 */
	public static void main(String[] args) {
		String s1="hello";
		String s2="";
		String s3="mee";
		String s4="hiii";
		String s5="flag";
		
		System.out.println(s1.compareTo(s2));//0
		
		System.out.println(s1.compareTo(s3));//-5
		
		System.out.println(s1.compareTo(s4));//
		
		System.out.println(s1.compareTo(s5));
		
	}
}
