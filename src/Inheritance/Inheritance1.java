package Inheritance;

class Employee {
	
	double salary=100.45;
	
	public static void display1() {
		System.out.println("Parent Method1");
	}
	
	public  void display2() {
		System.out.println("Parent Method2");
	}
	
	
}

public class Inheritance1 extends Employee{
	
	String name="Aditya";

	public static void main(String[] args) {
		
		Inheritance1 I=new Inheritance1();
		System.out.println(I.name);
		
		System.out.println(I.salary);
		display1();
		I.display2();
		
	}

}
