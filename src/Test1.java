class Test1 {

	int roll;
	String name;
	static String college = "ITS";

	//static method to change the value of static variable  
	static void change() {
		college = "GYS";
	}

	Test1(int R, String N) {
		 roll = R;
		name = N;
	}

	void display() {
		System.out.println(roll + " " + name + " " + college);
	}

	public static void main(String args[]) {
		Test1.change(); //calling change method  

		Test1 s1 = new Test1(1233, "Hari");

		s1.display();

	}
}
