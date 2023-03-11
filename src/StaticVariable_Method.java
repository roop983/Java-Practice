
public class StaticVariable_Method {
	
	static int x = 10;
	static int y;
	static int my_count=2;
	static void func(int z) {
	   System.out.println("x = " + x);
	   System.out.println("y = " + y);
	   System.out.println("z = " + z);
	}
	
	
	   public static void increment(){
	      my_count++;
	      System.out.println(my_count);
	   }


	public static void main(String[] args) {
		
		func(8);  //Without using object
		increment();

	}

}
