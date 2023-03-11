
public class Class1 {
	
	int id;
	String name;
	float salary;
	
	void insert(int i, String N, float S )
	{
	id=i;
	name=N;
	salary=S;
	}
	
	void display()
	{
		System.out.println("Value is:" +id+", "+name+", "+salary);
	}
	
	public static void main(String[] args) {
		
		Class1 Obj1=new Class1();
		Class1 Obj2=new Class1();
		Obj1.insert(20, "Shabnam", 4500);
		Obj1.display();
		//Obj1.id=20;
		//Obj1.name="xyz";
		
		
	}  
		
		
	}
	


