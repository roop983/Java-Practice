package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Most_Repeated_Element {

	public static void main(String[] args) {
		
		int[] A= {1, 2, 8, 3, 2, 2, 2, 5, 1 };
		
		Map<Integer,Integer> map=new HashMap<> ();
		
		for (int in:A) {
			
			if (map.get(in)!=null) {
				
				map.put(in, map.get(in)+1);
			}
			else
			{
				map.put(in, 1);
			}
		}
		
		
		List<Integer> list = new ArrayList(map.values());
		
		Collections.sort(list);
		
		for(Map.Entry<Integer, Integer> mEntry: map.entrySet()) {
			
			if (mEntry.getValue() == list.get(list.size()-1)) {
				System.out.println(mEntry.getKey());
			}
		}
	
		
		//n this program, we created a null Entry of Map type and then iterate over all the values of the map. 
		//Whenever we get a bigger value or null value we assign it to Entry and at the end simply print the value of Entry.
		
		Map.Entry<Integer,Integer> map_entry=null;
		
		for (Map.Entry<Integer,Integer> m_entry:map.entrySet() ) {
			
			if (map_entry==null || m_entry.getValue().compareTo(map_entry.getValue())>0) {
				
				map_entry=m_entry;
			}
		}
		
		
		System.out.println("The most repeated key in the map is: "+ map_entry.getKey()+" and its value is repeated "+map_entry.getValue()+" times");
		//Another simple way
		
		System.out.println(Collections.max(map.values()));
		
		
		

	}

}
