package com.array;

public class arrayDemo {

	public static void main(String args[]) {
		
		int a[];
		
		a=new int[3];
	
		a[0]=90;
		a[1]=80;
		a[2]=70;
		
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Elements at index  " +i+ " is " +a[i]);
		}
		
	}
}
