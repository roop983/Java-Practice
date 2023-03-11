package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Shuffle_HashMap {

	public static void main(String[] args) {
		
		int[] indices = {4,5,6,7,0,2,1,3 };
		
		String s="codeleet";
		
		//int[] indices = {4,0,2,6,7,3,1,5};
		
		//String s="aaiougrt";
		
		String suffled_string="";
		
		Map<Integer, Character> map=new HashMap<> ();
		
		for (int i=0;i<indices.length;i++)
		{
			
				map.put(indices[i], s.charAt(i));
		
		}
		
		System.out.println(map);
		/*
		
		map.put(0, 'c');
		map.put(1, 'l');
		map.put(2, 'l');
		
		*/
		
		List<Integer> sortedKeys=new ArrayList(map.keySet());
		Collections.sort(sortedKeys);
		
		//System.out.println(sortedKeys);
		
		for (int i=0;i<sortedKeys.size();i++) {
		 char st=map.get(sortedKeys.get(i));  
		 
		 
		 suffled_string=suffled_string+st;
		 
		}
		
		System.out.print(suffled_string);
		
		//System.out.println("Collection view is: "+ map.values());
		

	}

}
