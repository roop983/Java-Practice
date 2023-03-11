
public class StaticBlock {

	static{System.out.println("static block is invoked");}  // It is executed before the main method at the time of classloading.
	  public static void main(String args[]){  
	   System.out.println("Hello main");  
	  }  
	}  