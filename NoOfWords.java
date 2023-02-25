package com.mohoo;

import java.util.Scanner;

public class NoOfWords {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter something:");
		String s=sc.nextLine();
		char ch;
		int count=1;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(ch==' ') {
				count+=1;
			}	
		}
		System.out.println("Number of words:"+count);
	}

}
