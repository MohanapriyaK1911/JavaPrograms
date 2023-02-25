package com.mohoo;
import java.util.Scanner;
public class PrimenumberUptoGivenNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
	    int sum=0;
	    for (int i=2;i<=num;i++){
	       int count=0;
	      for(int j=1;j<=i;j++){
	        if(i%j==0){
	          count+=1;
	        }
	      }
	      if(count<=2){
	        sum+=1;    
	      }   
	    }
	    System.out.println("Prime numbers upto "+num+" is "+sum);
	}

}
