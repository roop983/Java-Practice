package AccessSpecifier;

class Adder{  
	
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;}  
}  

public class Method_Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));  

	}

}
