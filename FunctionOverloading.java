package polymorphism;

class OverLoading{
	void display() {
		System.out.println("Function with no argument");
	}
	void display(int i) {
		System.out.println("Function with integer argument: int="+i);
	}
	void display(float i) {
		System.out.println("Function with float argument: float="+i);
	}
	void display(double i) {
		System.out.println("Function with double argument: double="+i);
	}
	void display(float i,float j) {
		System.out.println("Function with two float arguments: float1="+i+" float2="+j);
	}
	void display(double i,double j) {
		System.out.println("Function with two double arguments: double1="+i+" double2="+j);
	}
	void display(int i,int j) {
		System.out.println("Function with two int arguments: int1="+i+" int2="+j);
	}
	void display(int i,float j) {
		System.out.println("Function with one int and one float arguments: int="+i+" float="+j);
	}
}
public class FunctionOverloading {
	public static void main(String args[]) {
		OverLoading a=new OverLoading();
		a.display();
		a.display(123);
		a.display(123.1234f);
		a.display(123.343322);
		a.display(870.78989f,90886.7897f);
		a.display(7687.0980,7670.878);
		a.display(65,788689);
		a.display(435,789.798f);
	}
}
