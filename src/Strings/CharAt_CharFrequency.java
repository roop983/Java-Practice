package Strings;

public class CharAt_CharFrequency {

	public static void main(String[] args) {
		
		String test="Welcome to Javatpoint portal";
		
		int length=test.length();
		
		int c=0;
		
		for (int i=0;i<=length-1;i++) {
			
			if (test.charAt(i) == 't') {
				c=c+1;
			}
			
		}
		
		System.out.println("Frequency of character t is: "+c);

	}

}
