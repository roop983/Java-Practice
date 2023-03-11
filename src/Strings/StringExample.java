package Strings;

public class StringExample {

	public static void main(String[] args) {
		
		
		String s1="Tina";
		String s1_1="Bhabhi";
		char ch[]= {'a','b','c'};
		String s2=new String(ch);
		String s3=new String ("xyz");
		
		s1=s1+" Bhabhi";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4="Hello ";
		String s5=s4.concat(s1);
		
		System.out.println(s5);
		
		System.out.println(s1.equalsIgnoreCase(s1_1));
		
		
		// Java String valueOf() method
		int i =10;
		String St=String.valueOf(i); //valueOf() method returns the String representation of the boolean, char, char array, int, long, float and double arguments.
		System.out.println("String Value Of Example1: "+St+30);
		System.out.println("String Value Of Example2: "+20+50+St+30);
		System.out.println(20+50+St+30);
		
		
		//equals and ==
		
		String s11="Sachin";  
		   String s22="Sachin";  
		   String s33=new String("Sachin");
		   String s44="SACHIN";  
		   System.out.println(s11==s22);//true (because both refer to same instance)  
		   System.out.println(s11==s33);//false(because s33 refers to instance created in nonpool)  
		   System.out.println(s11==s44);//false

	}

}
