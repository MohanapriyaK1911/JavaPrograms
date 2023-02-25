package com.mohoo;
class Product{
	String name;
	int id;
	Product(String name,int id){
		this(id);
		this.name=name;//this keyword refers to present object
	}
	Product(int id){
		this.id=id;
	}
	void display() {
		System.out.println("Product name:"+name);
		System.out.println("Product id:"+id);
	}
}

public class MainApp3 {
	public static void main(String args[]) {
		Product obj=new Product("Oppo",12345);
		obj.display();
	}
}
