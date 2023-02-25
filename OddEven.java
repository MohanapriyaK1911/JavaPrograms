package com.mohoo;
import java.util.Scanner;
public class OddEven {
	public static void main(String args[])
	   { 
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the Number:");
	     int i=sc.nextInt();
	     int a=i%2;
	     switch(a){
	       case 1:
	         System.out.println("Given number "+i+" is odd");
	         break;
	       case 0:
	         System.out.println("Given number "+i+" is even");
	        
	     }
	   }
}
