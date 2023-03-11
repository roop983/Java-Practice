package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Duplicate_Element_Map {

	public static void main(String[] args) {
		
		int[] A= {1,2,3,2,1,5,2,2 };
		
		int count=0;
		
		Map<Integer, Integer> map=new HashMap<> ();
		
		for (int in: A) {
			
			if ((map.get(in))!=null) {
				
				map.put(in, map.get(in) +1);
			}
			else
			{
				map.put(in, 1);
			}
			
		}
		
		Iterator<Integer> it=map.keySet().iterator();
		
		while (it.hasNext()) {
			
			int key=it.next();
			
			if (map.get(key) >1) {
				System.out.println(key);
				count++;
			}
		}
		
		System.out.println("Count of Duplicate keys are: "+count);

	}

}
