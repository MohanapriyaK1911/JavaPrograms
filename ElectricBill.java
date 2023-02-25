package program;
import java.util.Scanner;
public class ElectricBill {
	String n;
	int units;
	double bill;
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		n=sc.nextLine();
		System.out.println("Enter number of units cosumed:");
		units=sc.nextInt();
	}
	void calculate() {
		if (units<=100) {
			bill=units*2.0;
		}
		else if(units>100 && units<=300) {
			bill=100*2.0+(units-100)*3.00;
		}
		else if(units>300) {
			bill=100*2.0+200*3.00+(units-300)*5.00;
			double surcharg=bill*(2.5/100);
			bill=bill+surcharg;
		}
	}
	void print() {
		System.out.println("Name of the customer:"+n);
		System.out.println("Number of units consumed:"+units);
		System.out.println("Bill amount:"+bill);
	}
	public static void main(String args[]) {
		ElectricBill s=new ElectricBill();
		s.accept();
		s.calculate();
		s.print();
	}
}

