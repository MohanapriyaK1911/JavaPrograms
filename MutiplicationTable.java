package com.mohoo;
import java.util.Scanner;
public class MutiplicationTable {
	public static void main(String args[])
	   { 
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    System.out.println("Multiplication table for "+num+" is:");
	    for (int i=1;i<=10;i++){
	      int sum=num;
	      sum*=i;
	      System.out.println(num+"X"+i+"="+sum);
	    }
	}
}
