package Strings;

import java.util.HashSet;

public class String_First_Repeated_Char {

	public static void main(String[] args) {
	       
		String test="bebg";
		
		int length=test.length();
		
		
		
		
		char[] chArr=test.toCharArray();

		
		for (int i=0;i<length;i++) {
			
			
			
			for (int j=i+1;j<length;j++) {
				
				int c=j;
				if (chArr[i]!=chArr[j]) {
					c=c+1;
					
			}
				if (j==3 && )
				
			
			}
			
			
			//System.out.println("Frequency of char "+test.charAt(i)+" in the String is: "+c);
			
			//resetting the counter to 0, for the next check
			
		}
		
		
		

	}

}