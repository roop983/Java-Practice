package Test_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Map_Last_Repeating_char {

	static void LastRepeatingchar(String st) {
		
		char[] chAr=st.toCharArray();
		
		//char first_repeating_char;
		
		Map<Character, Integer> map=new LinkedHashMap<> ();
		
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
		
		LinkedList<Character> list=new LinkedList<> ();
		
		while (it.hasNext()) {
			
			char first_repeating_char=it.next();
			
			if (map.get(first_repeating_char) > 1) {
				
				list.add(first_repeating_char);
			}
		
		}
		
		System.out.println(list.getLast()); // 1st way of getting last element in the list
			
			System.out.println(list.get(list.size()-1)); // 2nd way

		
		
	
	}

	public static void main(String[] args) {
		
		String test="geeksforgeeks";
		
		LastRepeatingchar(test);

	}

}
