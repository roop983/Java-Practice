package Strings;

//https://www.javatpoint.com/understanding-toString()-method
/*As you can see in the above example, printing s1 and s2 prints the hashcode values of the objects but I want to print the values of these objects. 
 * Since Java compiler internally calls toString() method, overriding this method will return the specified values. Let's understand it with the example given below:*/
 
//The toString() method returns the String representation of the object.If you print any object, Java compiler internally invokes the toString() method on the object.
//By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.

class Student {
	
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Student(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	   
	 public String toString(){//overriding the toString() method  
	  return rollno+" "+name+" "+city;  
	 }
	 
}
public class String_ToString_method {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Raj","lucknow");  
		   Student s2=new Student(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  It will print hashcode values. Hence toString() method needs to be overriden to actually print the object values
		   System.out.println(s2);//compiler writes here s2.toString()  

	}

}
