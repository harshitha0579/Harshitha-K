package com.test;

import java.util.Scanner;

public class ScannerLaptopDemo {
	
	
	public static void main(String args[])
	{
	
		 Scanner sc = new Scanner(System.in);
		 int option;
		 
	    do
	    { 
	    	 
	       System.out.print( " \n Enter options");
	       System.out.println(" \n 1. ADD");
	       System.out.println("2. SUB");
	       System.out.println("3. Multiply");
	       System.out.println("4. EVEN/ODD");
	       System.out.println("5. QUIT");
	
	       option = sc.nextInt();
	
	       switch(option)
	       {
		
	       case 1: 
					System.out.println("Enter Two Numbers to add : ");
					int  a = sc.nextInt();
					int b = sc.nextInt();
					int result = a + b;
					System.out.println("The addition of " +a+ " and " +b+ " is " + result );
					break;
		
	       case 2:
				    System.out.println("Enter Two Numbers to sub : ");
				     a = sc.nextInt();
					 b = sc.nextInt();
					 result = a - b;
					System.out.println("The subtraction of " +a+ " and " +b+ " is " + result );
					break;
		
	       case 3:
					System.out.println("Enter Two Numbers to multiply : ");
				     a = sc.nextInt();
					 b = sc.nextInt();
					 result = a * b;
					System.out.println("The multiplication of " +a+ " and " +b+ " is " + result );
					break;
	     
	       case 4:
		    		System.out.println("Enter a number to check its even or odd : ");
				     a = sc.nextInt();
				     if( a % 2 == 0 )
				     {
				    	 System.out.println( a + "   is even number");
				     }
				     else
				     {
				    	 System.out.println( a + "   is odd number");
				     }
					break; 
					
	       case 5:
		    	      System.out.println("EXIT");
		    	      break;
	    	      
	       default :
			    	   System.out.println("default messages");
			    	      break;
			    	      
	       }
	       
	    }while(option != 5);
	    sc.close();
	}
}
