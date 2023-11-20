package com.array;

public class passingtomethod {
 
		static void add(int arr[]) {
			int add=0;
			for(int i=0;i<arr.length;i++)
					add=add+arr[i];
			System.out.println("Addition of  is  = " +add);
		}
		
		public static void main(String[] args) {
			
			int a[]= {10,20,30,80};
			add(a);
}
}