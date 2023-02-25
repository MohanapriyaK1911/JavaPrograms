package com.mohoo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	   { 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int i=sc.nextInt();
	    int count=0;
	    if(i==0 ||i==1) {
	    	System.out.println("Given number "+i+" is not a prime number");
	    }
	    else {
	    	for(int j=1;j<=i;j++){
	  	      if(i%j==0){
	  	        count+=1;
	  	      }
	  	    }
	  	    if(count<=2){
	  	      System.out.println("Given number "+i+" is a prime number");
	  	    }
	  	    else{
	  	      System.out.println("Given number "+i+" is not a prime number");
	  	    }
	    }
	    
	}

}
