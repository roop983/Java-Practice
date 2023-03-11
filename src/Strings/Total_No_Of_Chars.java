package Strings;

public class Total_No_Of_Chars {

	public static void main(String[] args) {
		
		String st="The best of both worlds";
		
		int length=st.length();
		int count=0;
		
		for (int i=0;i<=length-1;i++) {
			    if (st.charAt(i) != ' ') {
			    	count++;    
			    	
			    }
		}
		
		System.out.println("Total number of characters in a string: " + count);   
		
		//Other way
		String st1=st.replaceAll("\\s+", "");
		System.out.println(st1.length());

	}
	
	

}
