package com.mohoo;

public class BasicStringMethods {
	public static void main(String[] args) {
	    String name="This is a basic string methods";
	    System.out.println("No of characters ="+name.length());
	    System.out.println("Given string in uppercase="+name.toUpperCase());
	    System.out.println("Given String in lowercase ="+name.toLowerCase());
	    System.out.println("Check 'i' "+name.indexOf("i"));
	    System.out.println("'i' occurrance "+name.lastIndexOf("i"));
	  }
}
