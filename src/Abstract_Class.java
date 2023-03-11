abstract class MyClass //abstract class  
{  
	
	MyClass() {
		System.out.println("Abstract Class Constructor invoked");
	}
	
	
//abstract method declaration  
	abstract void display(String z); 
	
	void changeGear(){System.out.println("gear changed");}  
}  


public class Abstract_Class extends MyClass  
{  
	String name;
//method impelmentation  

	void display(String n)  
	{  
	name=n;
	System.out.println("Abstract method: "+name);  
	}  
	
	
	static void show() {
		
		System.out.println("Test Passed");
	}
	
	void changeGear(){System.out.println("gear changed and fixed");} //Method Overriding
	
	
	
public static void main(String args[])  
{  
//creating object of abstract class  using Object reference
	MyClass obj = new Abstract_Class();  
//invoking abstract method  
	obj.display("Roops"); 
	obj.changeGear();
	//obj.show();
	show();
	
	
}  
}
  