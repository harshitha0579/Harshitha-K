package com.array;

public class multiplymatrix {
	
	
public static void main(String args[])
{
	int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int arr2[][]= {{9,8,7},{6,5,4},{3,2,1}};
	int arr[][]=new int[3][3];
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			
			for(int k=0;k<3;k++)
			{
				arr[i][j]=arr1[i][k] * arr2[k][j];
			}
			System.out.print(arr[i][j]+ "   ");
		}
		System.out.println(" ");
	}
}
}
