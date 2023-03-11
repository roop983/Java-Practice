class Student {
	
	int roll;
	int ID;
	String name;
	float fee;
	
	Student (int roll, int ID,String name ) {
	
	this.roll=roll;
	this.ID=ID;
	this.name=name;

	
	}
	
	Student (int roll, int ID, String name, float fee) {
		
		this( roll, ID, name);
		this.fee=fee;	

}
	
	void display() {
		
		System.out.println(roll+" , "+ID+" , "+name+" , "+fee);
	}


}

public class This_keyword {

	public static void main(String[] args) {
		
		Student s1=new Student (5,1234, "Ajay");
		Student s2=new Student (6,423, "Vijay", 600f);
		s1.display();
		s2.display();
		
		
	}

}
