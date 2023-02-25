package com.mohoo;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Welcome");
		s.append("to");
		System.out.println("After adding the new string is:"+s);
		s.insert(9,"Java");
		System.out.println("After insertion the new string is:"+s);
		s.delete(7,9);
		System.out.println("After removing to:"+s);
		System.out.println("substring is:"+s.substring(7, 11));
		s.reverse();
		System.out.println("Reversed string is:"+s);
	}

}
