package Test_Strings;

public class Test14_Jewels_and_Stones {

	public static void main(String[] args) {
		
		/*
		 You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
		  Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".
Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0
		 */
		String jewels="aA";
		String stones="aAAbabbb";
		
		int count=0;
		
		for (int i=0;i<stones.length();i++) {
			
			for (int j=0;j<jewels.length();j++) {
				
				if (stones.charAt(i)==jewels.charAt(j)) {
					count++;
				}
			}
		}
		/*for (int i=0;i<jewels.length();i++) {
			
			for (int j=0;j<stones.length();j++) {
				
				if (jewels.charAt(i)==stones.charAt(j)) {
					count++;
				}
			}
		}*/
		
		System.out.println(count);
			 

	}

}
