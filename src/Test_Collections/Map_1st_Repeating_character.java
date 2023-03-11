package Test_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Map_1st_Repeating_character {
	
	static char firstRepeatingchar(String st) {
		
		char[] chAr=st.toCharArray();
		
		//char first_repeating_char;
		
		Map<Character, Integer> map=new HashMap<> ();
		
		for (char c:chAr) {
			
			if (map.get(c)!=null) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
			if(map.get(c) == 2) {
				return(c);
				
			}
			
		}
		return 1;
		
		//System.out.println(map);
		
		
	
	}

	public static void main(String[] args) {
		
		String test="geeksforgeeks";
		
		 char c = firstRepeatingchar(test);
		 
		 System.out.println(c);

	}

}
