package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_2_Sorted_Lists {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<> ();
		
		Collections.addAll(list1, 1,2,4);
		
		
		List<Integer> list2=new ArrayList<> ();
		Collections.addAll(list2, 1,3,4);
		
		list2.addAll(list1);
		
		Collections.sort(list2);
		
		System.out.println(list2);
	}

}
