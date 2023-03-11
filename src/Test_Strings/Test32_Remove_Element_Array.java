package Test_Strings;

import java.util.ArrayList;
import java.util.List;

public class Test32_Remove_Element_Array {

	public static void main(String[] args) {
		/*
		int[] inAr= {3,2,2,3};
		
		int val=2;
		
		int temp=0;
		
		List<Integer> list=new ArrayList<> ();
		
		for(int i=0;i<inAr.length;i++) {
			
			if (!(inAr[i]==val)) {
				inAr[temp]=inAr[i];
				list.add(inAr[i]);
				temp++;
			}
		}
		
		
		System.out.println(list.size());
		
		for (int i=0;i<temp;i++) {
			System.out.println(inAr[i]);
		}
		
*/
		int[] nums = {0,1,2,2,3,0,4,2};
		int val=2;
//		int removalCount =0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==val)
//                removalCount++;
//            else 
//                nums[i-removalCount] = nums[i];
//        }
//        System.out.println( nums.length-removalCount);
//        for(int i=0;i<nums.length;i++) {
//        	
//        	System.out.println( nums[i]);
//        }
        
        int temp =0;
        
        for (int i =0;i < nums.length;i++) {
        	if(nums[i]!=val) {
        		nums[temp] = nums[i];
        		temp++;
        	}
        }
        System.out.println(temp);
        
        
	}

}

/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. 
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

 

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

*/
