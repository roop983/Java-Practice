package AccessSpecifier;


 class Student{  
	//private data member  
	private String name = "Ajay";  
	//getter method for name  
	public String getName(){  
	return name;  
	}  
	//setter method for name  
	public void setName(String name){  
	this.name=name ; 
	}  
	
	void cube( final int n){
		   //n=n+2;//can't be changed as n is final
		  System.out.println(n*n*n); ;
		  }
	}  

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();  
		//setting value in the name member  
		s.setName("vijay");  
		//getting value of the name member  
		System.out.println(s.getName());  
		s.cube(5);
	}

}
