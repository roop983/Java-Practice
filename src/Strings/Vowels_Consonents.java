package Strings;

public class Vowels_Consonents {

	public static void main(String[] args) {
      String st="This is a really simple sentence";
		
      st = st.toLowerCase();    
		int length=st.length();
		int vowel_count=0;
		int cons_count=0;
		
		for (int i=0;i<=length-1;i++) {
			    if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
			    	vowel_count++; 
			    }
			    else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
			    	cons_count++;
			    	
			    }
		}
		
		System.out.println("Total number of vowels in a string: " + vowel_count);  
		System.out.println("Total number of consonents in a string: " + cons_count);  

	}
	
}