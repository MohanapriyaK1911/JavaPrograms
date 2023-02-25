package com.mohoo;
import java.util.Scanner;
public class EqualsMethod {
	public static void main(String[] args) {
	    String uname,upass;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter name ");
	    uname=sc.next();
	    System.out.println("Enter password ");
	    upass=sc.next();
	      
	    if(uname.equalsIgnoreCase("mohana") && upass.equals("mohana123")){
	    	System.out.println("Valid user");
	    }  
	    else {
	        System.out.println("Not valid");
	    }
	}
}
