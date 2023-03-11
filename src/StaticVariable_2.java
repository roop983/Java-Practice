
public class StaticVariable_2 {
	
	static int my_count=2;
	   public static void increment(){
	      my_count++;
	   }

	public static void main(String[] args) {
		StaticVariable_2 obj_1=new StaticVariable_2(); //Object instances being used
		StaticVariable_2 obj_2=new StaticVariable_2();
		  increment();
	     // obj_2.increment();
	     
	      System.out.println("The count of first object is "+obj_1.my_count);
	      System.out.println("The count of second object is "+obj_2.my_count);

	}
	
	/*A class named Demo defines a static variable, and a function named ‘increment’ that increments the value of the static variable. 
	 * The main function creates two instances of the class, and the increment function is called on both the object. 
	 * The count is printed on the screen. It shows that static variable is shared between objects.
	 * 
	 * The static variable is a class level variable and it is common to all the class objects i.e. a single copy of the static variable is shared among all the class objects.
	 */




}
