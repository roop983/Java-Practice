package Test_Strings;

import java.util.ArrayList;
import java.util.List;

public class Test33_Remove_Duplicates_Sorted_Array {
	
	/*Leetcode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	Input: nums = [0,0,1,1,1,2,2,3,3,4]
			Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
			Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
			It does not matter what you leave beyond the returned k (hence they are underscores).
			*/
	
	public static int removeDuplicates(int[] nums) {
        
		List<Integer> list=new ArrayList<> ();
		
		for(int in:nums) {
			if (!list.contains(in)) {
				
				list.add(in);
			}
		}
		
		//System.out.println(list.size());
		
		for (int i =0;i<list.size();i++) {
			nums[i]=list.get(i);
		}
		
		
		
		for (int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		return list.size();

    }
	

	public static void main(String[] args) {
		
		
		int[] num= {0,0,1,1,1,2,2,3,3,4};
		
		int k= removeDuplicates(num);
		
		System.out.println("\n"+k);
		
		//System.out.println(removeDuplicates(num));
		
		
		
	}

}
