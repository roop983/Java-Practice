
public class Default_Constructor {

	int num ;
	Default_Constructor(){
	      num = 100;
	   }
	Default_Constructor(int num){
	      this.num = num;
	   }
	public static void main(String[] args) {
		
		System.out.println(new Default_Constructor().num);  //Accessing the constructor 
	      System.out.println(new Default_Constructor(1000).num); //Accessing the constructor 

	}
	
	/*Default Constructor
It is recommended to provide any of the above-mentioned contractors while defining a class. If not Java compiler provides a no-argument, default constructor on your behalf.

This is a constructor initializes the variables of the class with their respective default values (i.e. null for objects, 0.0 for float and double, false for boolean, 0 for byte, short, int and, long).

If you observe the following example, we are not providing any constructor to it.

 */

}
