package Test_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 https://leetcode.com/problems/first-unique-character-in-a-string/
 * Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
 */

public class List_1st_NonRepeating_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "loveleetcode";
		
		int i; 
		int count =0;
		for (i =0;i< test.length();i++) {
			 //count =0;
			if (test.indexOf(test.charAt(i)) == test.lastIndexOf(test.charAt(i))) {
				System.out.println(test.indexOf(test.charAt(i)));
				count++;
				break;
			}
			
		}
		if (count == 0 ) {
			System.out.println("-1");
		}
			
			
		
	}

}
