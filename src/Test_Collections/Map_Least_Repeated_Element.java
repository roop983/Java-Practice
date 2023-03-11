package Test_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Least_Repeated_Element {

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
		
		System.out.println("Least Repeated elements are: ");
		Map.Entry<Integer, Integer> map_entry=null;
		
		for (Map.Entry<Integer, Integer> m_entry : map.entrySet()) {
			
			if (m_entry.getValue()==1) {
				
				System.out.println(m_entry.getKey());
				
			}
		}
		
		//System.out.println("The most repeated key in the map is: "+ map_entry.getKey());
		
		
		

	}

}
