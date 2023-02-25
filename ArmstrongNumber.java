package com.mohoo;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[])
	   {
	     int num,a,b,digit,count=0,sum=0;
	     Scanner sc=new Scanner(System.in); 
	     System.out.println("Enter the number");
	     num=sc.nextInt();
	     a=num;
	     b=num;
	     while(num!=0){
	       count+=1;
	       num=num/10;
	     }
	     while(b!=0){
	       digit=b%10;
	       sum+=(Math.pow(digit,count));
	       b=b/10;
	     }
	     if(a==sum){
	       System.out.println("Given number "+a+" is an armstrong number");
	     }
	     else{
	       System.out.println("Given number "+a+" is not an armstrong number");
	     }
	 }

}
