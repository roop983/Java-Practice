package Test_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Map_Unique_Substrings {
	
	public static void findNonRepeatString(String st1) {
		
		Map<Character, Integer> map=new HashMap<> ();
		
		List<Integer> list_MapValues=new ArrayList<> ();
		
			char[] cAr=st1.toCharArray();
			
			for (char c:cAr) {
				
				if (map.get(c)!=null) {
					map.put(c, map.get(c)+1);
				}
				else 
				{
					map.put(c, 1);
					
				}
					
			}
			
			System.out.println(map);
			
			list_MapValues.addAll(map.values());
			
			Iterator<Character> it=map.keySet().iterator();
			
			
				
				for (int i=0;i<list_MapValues.size();i++) {
					
					if (!list_MapValues.contains(1)) {
						
						break;
						
					}
					else
					{
						while (it.hasNext()) {
							char c=it.next();
							
						}
					}
					
				}
				

			
		}
		
	

	public static void main(String[] args) {
		
		String s="pwwkew";
		
		List<String> list=new ArrayList<> ();
		
		for (int i=0;i<s.length();i++) {
			
			for (int j=i;j<s.length()-1;j++) {
				
				String st=s.substring(i,j+2);
				list.add(st);
			}
		}
		System.out.println(list);
		
		for (String st1:list) {
			
			findNonRepeatString(st1);
			
		}
		
		
		//System.out.println(list);
		
		
		

	}

}
