package com.StringDemo;

public class StringBuilderDemo {

	public static void main(String args[])
	{
		
		//append
		StringBuilder sb = new StringBuilder("helloooo ");
		sb.append("world");
		System.out.println(sb);
		
		//replace
		StringBuilder sb1 = new StringBuilder("java");
		sb1.replace(1, 3, "hi");
		System.out.println(sb1);
		
		//delete
		StringBuilder sb2 = new StringBuilder("Amber");
		sb2.delete(1, 2);
		System.out.println(sb2);
		sb2.deleteCharAt(3);
		System.out.println(sb2);
		
		//reverse
		StringBuilder sb3 = new StringBuilder("Stack");
		sb3.reverse();
		System.out.println(sb3);
		
		//insert
		StringBuilder sb4 = new StringBuilder("Full");
		sb4.insert(3, "i");
		System.out.println(sb4);
	}
}
