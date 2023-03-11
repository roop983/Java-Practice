package AccessSpecifier;


class Employee {
	
	int salary=100;
	
	static int sum (int a, int b) {
		return a+b;
	}
	
	static double sum (int a, int b, int c) {
		return a+b;
	}
	
	
	
}


public class MethodOverloading {
	
	static int addition (int a, int b) {
		return a+b;
		
	}
	
	static double addition (int a, int b, int c) {
		return a+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Employee.sum(11,12));
		
		System.out.println(addition(11,12));
		
		System.out.println(addition(11,12, 13));
		
		
		
	}

}
