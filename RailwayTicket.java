package program;
import java.util.Scanner;
public class RailwayTicket {
	String name;
	String coach;
	long mobno;
	int amount;
	int totalamt;
	
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		name=sc.nextLine();
		System.out.println("Enter which coach you want");
		coach=sc.nextLine();
		System.out.println("Enter mobile no");
		mobno=sc.nextLong();
		System.out.println("Enter amount");
		amount=sc.nextInt();
	}
	void update() {
		if(coach.equals("First_AC")) {
			System.out.println(totalamt=(amount+700));
		}
		else if(coach.equals("Second_AC")) {
			System.out.println(totalamt=(amount+500));
		}
		else if(coach.equals("Third_AC")) {
			System.out.println(totalamt=(amount+700));
		}
		else if(coach.equals("sleeper")) {
			System.out.println(totalamt=amount);
		}
	}
	public static void main(String args[]) {
		RailwayTicket s=new RailwayTicket();
		s.accept();
		s.update();
	}

}

