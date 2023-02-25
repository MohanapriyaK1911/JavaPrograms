package com.mohoo;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String args[]){ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int i=sc.nextInt();
	    int a=i;
	    int reverse=0;
	    while (i!=0){
	      int digit=i%10;
	      reverse=reverse*10+digit;
	      i=i/10;
	    }
	    if(a==reverse){
	      System.out.println("Given number "+a+" is a palindrome number");
	    }
	    else{
	      System.out.println("Given number "+a+" is not a palindrome number");
	    }
	}

}
