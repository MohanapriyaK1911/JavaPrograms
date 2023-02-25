package com.mohoo;
class A{
	int pnum;
	A(int i){
		pnum=i;
	}
}
class B extends A{
	int cnum,sum;
	B(int i,int j){
		super(i);//to call parent class constructor from child class
		cnum=j;
	}
	void sum() {
		sum=pnum+cnum;
	}
	void display() {
		
		System.out.println("Sum is "+sum);
	}
}

public class MainApp2 {
	public static void main(String args[]) {
		B obj=new B(10,20);
		obj.sum();
		obj.display();
	}
}