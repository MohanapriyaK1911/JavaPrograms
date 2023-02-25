package com.mohoo;
import java.util.Scanner;
public class ArrayUserInput {
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no of elements:");
	    int n=sc.nextInt();
	    sc.nextLine();
	    String names[]= new String[n];
	    System.out.println("Enter the name:");
	    for(int i=0;i<n;i++){
	      names[i]=sc.nextLine();
	    }
	    System.out.println("Names are:");
	    for(int j=0;j<n;j++){
	      System.out.println(names[j]);
	    }
	}

}
