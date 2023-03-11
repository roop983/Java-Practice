package Strings;

import java.util.ArrayList;
import java.util.List;

public class String_Needle {

	public static void main(String[] args) {
		
		 final String word = "abc";
	     final String text = "abcxaaabbbccyaxbcayxycab";
	     
	     List<Character> list=new ArrayList<> ();
	     
	     StringBuilder sb=new StringBuilder();
	     
	     for (Character c: text.toCharArray()) {
	    	 
	    	 if (word.contains(c.toString()) && !list.contains(c)) {
	    		 
	    		 list.add(c);
	    		 sb.append(c);
	    		 
	    		 if (word.length()==sb.length()) {
	    			 System.out.println(sb.toString());
	    			 list.clear();
		    		 sb=new StringBuilder();
	    		 }
	    		 
	    	 }
	    	 else
	    	 {
	    		 
	    		 list.clear();
	    		 sb=new StringBuilder();
	    	 }
	    	 
	     }

	}

}
