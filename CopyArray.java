package com.mohoo;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		int copyArray1[]=new int[a.length];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Original Array Elements are");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			copyArray1[i]=a[i];
		}
		
		System.out.println("Copied array is");
		for(int i=0;i<a.length;i++) {
			System.out.println(copyArray1[i]);
		}
	}

}
