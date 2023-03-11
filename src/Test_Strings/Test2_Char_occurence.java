package Test_Strings;

public class Test2_Char_occurence {

	public static void main(String[] args) {
		
		 String test="beginnersbookb";
		 
		 
		 for (int i=0;i<test.length();i++) {
			 
			 int count=1;
			 
			 for (int j=i+1;j<test.length();j++) {
				 
				 if (test.charAt(i)==test.charAt(j)) {
					 
					 count++;
					 
				 }
				 
				 
				 
			 }
			/*
			 if (count > 1 ) {
				 System.out.println("Frequency of character: "+test.charAt(i)+" is "+count);
				}
			*/	
			 
			 System.out.println("Frequency of character: "+test.charAt(i)+" is "+count);
			 
				
			 
			 
		 }

	}

}
