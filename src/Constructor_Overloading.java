
public class Constructor_Overloading {

	int id;
	String name;
	String age;
	
	Constructor_Overloading(int ID1, String Name1)
	{
		id=ID1;
		name=Name1;
	}
	
	Constructor_Overloading(int ID2, String Name2,String Age2)
	{
		id=ID2;
		name=Name2;
		age=Age2;
		
	}
	
	Constructor_Overloading(Constructor_Overloading S1) //Copy  values of one object into another using Java constructor.
	{
		id=S1.id;
		name=S1.name;
		age=S1.age;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	
	
	public static void main(String[] args) {
		
		Constructor_Overloading C1=new Constructor_Overloading(10,"Name1");
		Constructor_Overloading C2=new Constructor_Overloading(20,"Name2","Age2");
		Constructor_Overloading C3=new Constructor_Overloading(C2);
		C1.display();
		C2.display();
		C3.display();
		

	}

}
