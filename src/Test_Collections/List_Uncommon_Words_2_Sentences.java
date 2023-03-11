package Test_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class List_Uncommon_Words_2_Sentences {

	public static void main(String[] args) {
		
		
		String s1= "this apple is sweet";
		
		String s2= "this apple is sour";
		
		String[] s1Ar=s1.split("\\s+");
		
		String[] s2Ar=s2.split("\\s+");
		
		
		List<String> list1 = Arrays.asList(s1Ar);
		List<String> list2 = Arrays.asList(s2Ar);
		
		Set<String> set = new HashSet<>();
		
		for(String st: s2Ar) {
			if(!list1.contains(st)) {
				set.add(st);
			}
		}
		
		
		for(String st: s1Ar) {
			if(!list2.contains(st)) {
				set.add(st);
			}
		}
		System.out.println(set);
		
		//OR
		
//		List<String> list=new ArrayList<> ();
//		
//		
//		for (String s: s1Ar) {
//			
//			list.add(s);
//		}
//		
//		for (String s: s2Ar) {
//			
//			list.add(s);
//		}
//		
//		Map<String, Integer> map=new HashMap<> ();
//		
//		for (String s: list ) {
//			
//			if (map.get(s)!=null) {
//				
//				map.put(s, map.get(s)+1);
//			}
//			
//			else
//			{
//				map.put(s, 1);
//			}
//				
//		}
//		
//		String[] s3=new String[s1Ar.length];
//				
//				int temp=0;
//		
//		Iterator<String> it=map.keySet().iterator();
//		
//		while (it.hasNext()) {
//			
//			String st=it.next();
//			
//			if (map.get(st) ==1) {
//				
//				System.out.println(st);
//				s3[temp]=st;
//				temp++;
//			}
//			
//		}
//		
//		for (int i=0;i<temp;i++) {
//			
//			System.out.println(s3[i]);
//		}
//		
//		
		
		
		}

	

}
