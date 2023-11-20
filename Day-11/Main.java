package com.array;

public class Main {

	public static void main(String[] args) {
		
		Employee arr[];
		
		arr=new Employee[3];
		
		arr[0]= new Employee(1001,"abc","bangalore");
		arr[1]= new Employee(1002,"xyz","mysore");
		arr[2]= new Employee(1003,"pqr","udupi");
		
		for(Employee i:arr)
		{
			System.out.println(+i.id+ " " +i.name+ " " +i.loc);
		}
		
	}

}
