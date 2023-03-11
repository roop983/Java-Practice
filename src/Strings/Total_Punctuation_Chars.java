package Strings;

public class Total_Punctuation_Chars {

	public static void main(String[] args) {
       
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";    
		
		int length=str.length();
		int count=0;
		
		for (int i=0;i<=length-1;i++) {
			//Checks whether given character is punctuation mark    
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
			str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')   {
				
			    	count++;    
			    	
			    }
		}
		
		System.out.println("The number of punctuations exists in the string is: " +count);    

	}

}