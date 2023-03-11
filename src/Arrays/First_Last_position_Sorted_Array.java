package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class First_Last_position_Sorted_Array {

	//https://java2blog.com/search-for-a-range-leetcode-find-first-and-last-position-of-element-sorted-array/
	public static void main(String[] args) {
		
		int[] A= {2,3,4,5,5,7,7,7,9,11};
		
		int target=7;
		
		LinkedList<Integer> list=new LinkedList<> ();
		
		for (int i=0;i<A.length;i++) {
			
			if (A[i]==target) {
				list.add(i);
			}
		}
		
		System.out.println(list);
	
		System.out.println(list.getFirst()+" "+list.getLast());

	}

}
