package polymorphism;
class Parent{
	void display() {
		System.out.println("Display method of parent class");
	}
}
class Child extends Parent{
	/**void display() {
		super.display();
		System.out.println("Display method of parent class");
	}  **/
}

public class FunctionOverriding {
	public static void main(String args[]) {
		Child obj=new Child();
		obj.display();
	}
}
