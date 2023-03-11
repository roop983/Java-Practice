package Test_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_comparison_common_words_2nd_method {

	public static void main(String[] args) {
	
		String[] words1= {"leetcode","is","amazing","as","is"};
		
		String[] words2={"amazing","leetcode","is"};
		
		int value=0;
		
		Map<String, Integer> map1=new HashMap<> ();
		
		for (String st:words1) {
			
			if (map1.get(st)!=null) {
				
				map1.put(st, map1.get(st)+1);
			}
			else
			{
				
				map1.put(st, 1);
			}
		}
		
		for (String st: words2) {
			
			 value=map1.get(st);
			if (map1.containsKey(st) && map1.get(st) < 2) {
				
				map1.put(st, value-1);
				
			}
		}
		int count=0;
		
		for (Map.Entry<String, Integer> map_entry:map1.entrySet()) {
			
			if (map_entry.getValue()==0) {
				
				count++;
			}
			
		}
		
		System.out.println(count);
		

	}

}
