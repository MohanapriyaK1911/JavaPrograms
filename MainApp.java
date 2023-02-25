package com.mohoo;
class A1{
	int pnum;
	A1(){
		pnum=10;
	}
}
class B1 extends A1{
	int cnum,sum;
	B1(){
		cnum=20;
	}
	void sum() {
		sum=pnum+cnum;
	}
	void display() {
		
		System.out.println("Sum is "+sum);
	}
}

public class MainApp {
	public static void main(String args[]) {
		B1 obj=new B1();
		obj.sum();
		obj.display();
	}
}

