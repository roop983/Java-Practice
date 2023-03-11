package Test_Strings;
import java.io.*;
import java.util.*;

public class Test12_Remove_Vowels_String {

	public static void main(String[] args) {
		String st="This is an apple";
		
		String[] vowelArr= {"a", "e", "i", "o", "u"};
		
		String st_new="";
		
	      //st = st.toLowerCase();    
			int length=st.length();
			    
				for (String sv:vowelArr) {
			    	
					String st1[]=st.split(sv);	
					
					
					for (String s: st1) {
						
						st_new=st_new.concat(s);
						
					}
					st=st_new;
					st_new="";
					
			    }
			
			System.out.println(st); 
			
			/* The reason for the above output is because toString() call on the array is going to Object superclass where it’s implemented differently
			String st_modified=st1.toString(); 
			System.out.println("Java String array to String = "+st_modified);
			
			
			//System.out.println(Arrays.toString(st1));*/
			


	}

}
