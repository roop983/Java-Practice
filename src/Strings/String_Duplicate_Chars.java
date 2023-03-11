package Strings;

public class String_Duplicate_Chars {

	public static void main(String[] args) {
       
		String test="beginnersbook";
		
		int length=test.length();
		
		//int c=0;
		
		
		char[] chArr=test.toCharArray();

		
		for (int i=0;i<length;i++) {
			
			
			
			for (int j=i+1;j<length;j++) {
				
				if (chArr[i]==chArr[j]) {
					System.out.println(chArr[j]);
					//c=c+1;
					
			}
				
				
			
			}
			
			
			//System.out.println("Frequency of char "+test.charAt(i)+" in the String is: "+c);
			
			//resetting the counter to 0, for the next check
			
		}
		
		
		

	}

}