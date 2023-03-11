package Test_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class Map_1st_NonRepeating_character {

static void firstNonRepeatingchar(String st) {
		
		char[] chAr=st.toCharArray();
		
		//char first_repeating_char;
		
		LinkedList<Character> list =new LinkedList<>();
		
		Map<Character, Integer> map=new HashMap<> ();
		
		for (char c:chAr) {
			
			if (map.get(c)!=null) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
		
	Iterator<Character> it=map.keySet().iterator();
		
		while (it.hasNext()) {
			
			char first_non_repeating_char=it.next();
			
			if (map.get(first_non_repeating_char)==1 ) {
				System.out.println(first_non_repeating_char);
				break;
			}
			
			
		} 
		
	}

	public static void main(String[] args) {
		
		String test="geeksforgeeks";
		
		 firstNonRepeatingchar(test);

	}

}
