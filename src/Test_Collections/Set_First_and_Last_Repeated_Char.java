package Test_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Set_First_and_Last_Repeated_Char {

	public static void main(String[] args) {
		
		String test="geeksforgeeks";
		
		char[] cAr=test.toCharArray();
		
		Set<Character> set=new LinkedHashSet<> ();
		
		Set<Character> setDup=new LinkedHashSet<> ();
		
		for (char c: cAr) {
			
			if (set.contains(c)) {
				
				setDup.add(c);
			}
			else
				set.add(c);
		}
		
		System.out.println(setDup);
		
		//String[] stAr=setDup.toArray(new String[setDup.size()]);
		
		LinkedList<Character> list_repeated=new LinkedList(setDup);
		
		System.out.println(list_repeated.getFirst());
		System.out.println(list_repeated.getLast());
		
		
		
		
		
		

	}

}
