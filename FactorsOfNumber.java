package com.mohoo;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String args[]){ 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int i=sc.nextInt();
	    System.out.println("Factors of "+i+" is");
	    for(int j=1;j<=i;j++){
	      if(i%j==0){
	        System.out.println(j);
	      }
	    }
	}


}
