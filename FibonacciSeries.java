package com.mohoo;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]){ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no terms:");
	    int i=sc.nextInt();
	    int a=0;
	    int b=1;
	    int sum=0;
	    System.out.println("Fibinacci series");
	    for (int x=1;x<=10;x++){
	      System.out.println(a);
	      sum=a+b;
	      a=b;
	      b=sum;
	    }
	}

}
