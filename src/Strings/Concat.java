package Strings;

public class Concat {

	public static void main(String[] args) {
		
		//String s1="Java String";
		
		String s1=new String("Java String");
		s1.concat("is immutable");
		System.out.println(s1);
		
		s1=s1.concat(" is immutable, so assign it explicitly");
		System.out.println(s1);
		
		 String str1 = "Hello";  
	     String str2 = "Javatpoint";  
	     String str3 = "Reader";  
	     
	   //  String str4=str1.concat(" ").concat(str2.concat(" ").concat(str3));
	     
	     
	     String str4_1=str1.concat(" ").concat(str2).concat(" ").concat(str3);
	     System.out.println(str4_1);
	     
	     //System.out.println(str4);
	     
	     String str5=str1.concat("!!!");
	     System.out.println(str5);
	     
	     String str6=str1.concat("@").concat(str2);
	     System.out.println(str6);
	     
	     System.out.println(str6.endsWith("t"));  

	}

}
