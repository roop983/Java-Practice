package Strings;

public class CharOccurence {

	public static void main(String[] args) {
		
		//Use Map for storing data. It will show the frequency of characters stored
        String test="beginnersbook";
		
		int length=test.length();
		
		
		

		
		for (int i=0;i<length;i++) {
			
			int c=1;
			
			for (int j=i+1;j<length;j++) {
				
				if (test.charAt(i) == test.charAt(j)) {
					c=c+1;
			}
			
			
			}
			
			System.out.println("Frequency of char "+test.charAt(i)+" in the String is: "+c);
			
			 //resetting the counter to 0, for the next check
			
		}
		
		
		

	}

}
