package Test_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_reverse_sentence {

	public static void main(String[] args) {
		String s="  Bob    Loves  Alice   ";
			
		String[] words = s.trim().split("\\s+"); //single or more than 1 space
		
		
		for (int i=words.length-1;i>=0;i--) {
			
			System.out.print(words[i]+" ");
		}
		
		System.out.println("*******");
		List list=Arrays.asList(words);
		Collections.reverse(list);
		
		System.out.println(list);
	   // Collections.reverse(Arrays.asList(words));
	    
		
		
		
	    String res=String.join(" ", words);
	    
	  
	    System.out.println(res);
	    
	    //OR
	    /*
	    String res1="";
	    for (int i=0;i<list.size();i++) {
			
			res1=res1+list.get(i)+" ";
		}
	    System.out.println(res1.trim());
	    
	    */

	}

}
