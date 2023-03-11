package Test_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lists_comparison_common_elements {

	public static void main(String[] args) {
		
//		List<String> c1= new ArrayList<String>();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        c1.add("Yellow");
//        c1.add("Purple");
//
//        List<String> c2= new ArrayList<String>();
//        c2.add("Indigo");
//        c2.add("Green");
//        c2.add("Black");
//        c2.add("Pink");
//        c2.add("Red");
//        c2.add("Blue");
//        
//        int count=0;
//        
//        for (String st:c1) {
//        	
//        	if (c2.contains(st)) {
//        		System.out.println(st);
//        		count++;
//        	}
//        }
//        
//        System.out.println(count);
   

		//Another example
		
		String[] words1= {"a","ab"};
		
		String[] words2={"a","a","a","ab"};
		
		List<String> list = Arrays.asList(words1);
		
		Set<String> set = new HashSet<>();
		
		for(String st: words2) {
			if(list.contains(st)) {
				set.add(st);
			}
		}
		System.out.println(set);
		
		
	}

}
