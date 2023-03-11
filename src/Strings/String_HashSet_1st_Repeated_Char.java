package Strings;

import java.util.HashSet;
import java.util.Set;

public class String_HashSet_1st_Repeated_Char {
	
	
	public static void main(String[] args) {
		
		String test="geeksforgeeks";
		
		char[] cAr=test.toCharArray();
		
		Set<Character> set=new HashSet<>();
		
		for (char c: cAr) {
			
			if (set.contains(c)) {
				
			System.out.println(c);
				break;
			}
			else
				set.add(c);
		}
		
		//System.out.println(set);

	}

}
