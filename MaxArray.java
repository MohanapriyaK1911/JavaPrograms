package com.mohoo;

import java.util.Scanner;

public class MaxArray {
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int n;//n-number of elements
			System.out.println("Enter no of elements");
			n=sc.nextInt();
		    int array1[]=new int[n];
		    System.out.println("Enter array elements");
		    for(int i=0;i<array1.length;i++) {
		    	array1[i]=sc.nextInt();
		    }
		    int max=array1[0];
		    for(int i=1;i<array1.length;i++){
		    	if (array1[i]>array1[0]){
		    		max=array1[i];
		        }  	
		    }
		    System.out.println("The largest number is "+max); 
		}
	}