package Test_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Map_comparison_EPAM_Test {

	public static void main(String[] args) {
		
		String[] stAr= {"abc", "ahdcaba", "xayzabcd","1234","ggggggggg"};
		char[] chAr= {'a', 'a','b', 'c'};
		
		int len=chAr.length;
		
		
		
		Map<Character, Integer> map=new HashMap<> ();
		
		for (char c:chAr) {
			if (map.get(c)!=null) {
				
				map.put(c, map.get(c)+1);
			
		}
			else {
				
				map.put(c,1);
			}
		
		}
		
		for (String st:stAr ) {
			
		Map<Character, Integer> map1=new HashMap<> ();
			
			for (char c: st.toCharArray()) {
				
				if (map1.get(c)!=null) {
					
					map1.put(c, map1.get(c)+1);
				
			}
				else {
					
					map1.put(c,1);
				}
			}
			int count=0;
			for (Map.Entry m: map.entrySet()) {
				
				char c=(char) m.getKey();
				if (map1.containsKey(m.getKey())) {
					
					if (map1.get(c)>=map.get(c)) {
						count++;
					}
					
				}
				
			}
			
			if (count>=map.size()) {
				
				System.out.println(st);
				
			}
			
			map1.clear();
		}
		
		

	}

}
