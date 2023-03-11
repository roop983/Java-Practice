class StaticTest
{
	int roll;  //instance variable  
	String name;
	static String college="ITS"; //static variable  
	
	StaticTest(int R, String N)
	
	{
		roll=R;
		name=N;
	}
	
	void display() {
		
		System.out.println(roll+"  "+name+"  "+college);
	}
	
}

//Test class to show the values of objects  

public class StaticVariable {

	public static void main(String[] args) {
		
		StaticTest ST1=new StaticTest(5, "Karan");
		StaticTest ST2=new StaticTest(7, "Karan");
        
	//	StaticTest.college="BTY";  //we can change the college of all objects by the single line of code  
		
		ST1.display();
		ST2.display();
		
	}

}
