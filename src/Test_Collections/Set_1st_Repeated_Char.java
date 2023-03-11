package Test_Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_1st_Repeated_Char {
	
	
	public static void main(String[] args) {
		
		String test="geeksforgeeks";
		
		char[] cAr=test.toCharArray();
		
		//List<Character> set=new ArrayList<> ();
		//OR
		
		Set<Character> set=new HashSet<> ();
		
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
