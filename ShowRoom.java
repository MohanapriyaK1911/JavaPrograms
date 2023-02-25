package program;
import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobno;
	double cost;
	double dis;
	double amount;
	
	ShowRoom(){//constructor is same name as class
		name="";
		mobno=0;
		dis=0;
		cost=0;
		amount=0;
		}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter mobile no");
		mobno=sc.nextLong();
		System.out.println("Enter the cost");
		cost=sc.nextDouble();
		
	}
	void calculate() {
		if (cost<=10000){
			dis=(cost*5)/100;
		}
		else if(cost>10000 && cost<=20000){
			dis=(cost*10)/100;
		}
		else if(cost>20000 && cost<=30000) {
			dis=(cost*15)/100;
		}
		else if(cost>30000) {
			dis=(cost*20)/100;
		}
		amount=cost-dis;
	}
	void display() {
		System.out.println("Customer name="+name);
		System.out.println("Customer mobile no="+mobno);
		System.out.println("After discount the amount ="+amount);
	}
	
	public static void main(String args[]) {
		ShowRoom s=new ShowRoom();
		s.input();
		s.calculate();
		s.display();
	}

}
