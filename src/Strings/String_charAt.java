package Strings;

public class String_charAt {

	public static void main(String[] args) {
		
		String test="javaTpoint";
		char ch=test.charAt(4);
		System.out.println(ch);
		
		int length=test.length();
		
		System.out.println("Character at 0 index is: "+test.charAt(0)); // Fetching first character  
		
		System.out.println("Character at last index is: "+test.charAt(length-1)); // The last Character is present at the string length-1 index  

	}

}
