package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_comparison_common_words {

	public static void main(String[] args) {
		
		String[] words1= {"a","ab"};
		
		String[] words2={"a","a","a","ab"};
		
		
	
		Map<String, Integer> map1=new HashMap<> ();
		
		Map<String, Integer> map2=new HashMap<> ();
		
		for (String st:words1) {
			
			if (map1.get(st)!=null) {
				
				map1.put(st, map1.get(st)+1);
			}
			else
			{
				
				map1.put(st, 1);
			}
		}
		
		for (String st:words2) {
			
			if (map2.get(st)!=null) {
				
				map2.put(st, map2.get(st)+1);
			}
			else
			{
				
				map2.put(st, 1);
			}
		}
		
		int count=0;
		
		for (Map.Entry<String, Integer> map_entry:map1.entrySet()) {
			
			String s=map_entry.getKey();
			
			if (map2.containsKey(s)) {
				
				if (map1.get(s)==map2.get(s)) {
					
					System.out.println(s);
					count++;
					
				}
			}
		}
		
		System.out.println(count);
		
		

	}

}
