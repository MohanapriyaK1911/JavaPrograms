package com.mohoo;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String args[]){ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    int square=(num*num);
	    int sum=0;
	    while(square!=0){
	      int digit=square%10;
	      sum=sum+digit;
	      square=square/10;
	    }
	    if (num==sum){
	      System.out.println("Given number "+num+" is a neon number");
	    }
	    else{
	      System.out.println("Given number "+num+" is not a neon number");
	    }
	}

}
