package Test_Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Map_Lowest_Value {

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
		
		System.out.println(map);
		System.out.println("Minimum number in the map is: "+Collections.min(map.keySet()));
		
		System.out.println("Maximum number in the map is: "+Collections.max(map.keySet()));
		
		System.out.println("Maximum value in the map is: "+Collections.max(map.values()));
		
		
		int c = Collections.min(map.keySet());
		System.out.println(map.get(c));
		
		//System.out.println(Collections.max(map.keySet()));
		
		
		
		

	}

}
