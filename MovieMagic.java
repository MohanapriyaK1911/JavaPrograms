package program;
import java.util.Scanner;
public class MovieMagic {
	int year;
	String title;
	float rating;
	MovieMagic(){
		year =0;
		title="";
		rating=0;
	}
	void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year when it's released:");
		year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the title of the movie:");
		title=sc.nextLine();
		System.out.println("Enter your rating:");
		rating=sc.nextFloat();
	}
	void display() {
		if (rating>=0 && rating<=2.0) {
			System.out.println(title+" Flop");
		}
		else if(rating>=2.1 && rating<=3.4) {
			System.out.println(title+" semi-hit");
		}
		else if(rating>=3.5 && rating<=4.5) {
			System.out.println(title+"Hit");
		}
		else if(rating>=4.6 && rating<=5.0){
			System.out.println(title+" Super Hit");
		}
		else {
			System.out.println("Invaild input");
		}
	}
	public static void main(String args[]) {
		MovieMagic s=new MovieMagic();
		s.accept();
		s.display();
	}
}

