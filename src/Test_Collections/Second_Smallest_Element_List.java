package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Second_Smallest_Element_List {

	public static void main(String[] args) {
		
		int[] A= {5,2,8,7,1};
		
		int n=2;
		
		List<Integer> list=new ArrayList<> ();
		
		for (int in:A) {
			if (!list.contains(in)) {
				list.add(in);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println("Second Smallest Element is: "+list.get(n-1));
		
		

	}

}
