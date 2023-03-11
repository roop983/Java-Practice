package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_Intersection {
	
	/*https://leetcode.com/problems/intersection-of-two-arrays-ii/ 
	 * Given two integer arrays nums1 and nums2, return an array of their intersection. 
	 * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

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
		
		Set<Integer> set1=new HashSet<> ();
		
		for (int in:nums1) {
			
			set1.add(in);
		}
		
		Set<Integer> set2=new HashSet<> ();
		
		for (int in:nums2) {
			
			set2.add(in);
		}
		
		set1.retainAll(set2);
		System.out.println(set1);
		
		List<Integer> list=new ArrayList(set1);
		
		int[] inAr3=new int[list.size()];
		
		Integer[] integerAr3=list.toArray(new Integer[list.size()]);
		
		for (int i=0;i<integerAr3.length;i++) {
			
			inAr3[i]=integerAr3[i];
		}
		
		for (int i=0;i<inAr3.length;i++) {
			
			System.out.println(inAr3[i]);
		}
		
		
		

	}

}
