package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Largest_Element {

	public static void main(String[] args) {
		
		int[] A= {5,2,8,7,1};
		
		int n=1;
		
		List<Integer> list=new ArrayList<> ();
		
		for (int in:A) {
			if (!list.contains(in)) {
				list.add(in);
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
		
		
		System.out.println(" Largest Element is: "+list.get(n-1));
		

	}

}
