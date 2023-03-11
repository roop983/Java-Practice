package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Array_Intersection2 {
	
	/*https://leetcode.com/problems/intersection-of-two-arrays-ii/ 
	 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

 Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
	 */

	public static void main(String[] args) {
		
		int[] nums1= {1,2,2,1};
		
		int[] nums2= {2,2};
		
		List<Integer> list1 = new ArrayList<>();
		for (int i: nums1) {
			list1.add(i);
		}
		
		List<Integer> list2 = new ArrayList<>();
		for (int i: nums2) {
			list2.add(i);
		}
		
		List<Integer> list3 = new ArrayList<>();
		
		for (int i=0; i<list1.size();i++) {
			for(int j=0;j<list2.size();j++) {
				
				if(list1.get(i)==list2.get(j)) {
					list3.add(list1.get(i));
					list2.remove(j);
					break;
				}
			}
		}
		System.out.println(list3);

	}

}
