package com.mohoo;
import java.util.Scanner;
class Student{
	int sid;
	String sname;
	float sfees;
  
	void inputData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of student");
		sname=sc.nextLine();
		System.out.println("Enter student id");
		sid=sc.nextInt();
		System.out.println("Enter fees");
		sfees=sc.nextFloat();
	}
  
	void display() {
		System.out.println("Name="+sname);
		System.out.println("id="+sid);
		System.out.println("Fees "+sfees);
	}
}

public class StudentMain{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students");
		int n=sc.nextInt();
		Student stu[]=new Student[n];
		for(int i=0;i<stu.length;i++){
			stu[i]=new Student();
		}
		for(int i=0;i<stu.length;i++){
			stu[i].inputData();
		}
		System.out.println("All student details");
		for(int i=0;i<stu.length;i++){
			stu[i].display();
		}
	}
}