package Test_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Set_Duplicate_Numbers {

	public static void main(String[] args) {
		
		int[] intAr= {1,2,3,2,1,5,1 };
		
		//Using Hash Map
		
		/*
		Map<Integer, Integer> map=new HashMap<> ();
		
		for (int in:A) {
			
			if (map.get(in)!=null) {
				map.put(in, map.get(in) + 1);
			}
			else
				map.put(in, 1);
		}
		
		Iterator<Integer> it=map.keySet().iterator();
		
		while (it.hasNext()) {
			
			int i=it.next();
			
			if (map.get(i) > 1) {
				System.out.println(i);
			}
		}
		*/
		
		//Using List and Set
		
		int len=intAr.length;
		
		int duplicate;
		
		List<Integer> list=new ArrayList<Integer>();
		
		Set<Integer> set=new HashSet<> ();
		
		for (int i=0;i<len;i++) {
			
			if (!list.contains(intAr[i])) {
				
				list.add(intAr[i]);
				
			}
			
			else
			{
				duplicate=intAr[i];
				set.add(duplicate);
			}
		}
		
		System.out.println(set);
		
		

	}

}
