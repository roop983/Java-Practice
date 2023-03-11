package Test_Strings;

public class Test22_Number_of_Strings_Substring {

	public static void main(String[] args) {
		
		/*Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

Example 1:

Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".
3 of the strings in patterns appear as a substring in word.
*/
		String[] array= {"a","abc","bc","d" };
		
		String word="abc";
		
		int count=0;
		
		for (String st:array ) {
			
			if (word.contains(st)) {
				count++;
				System.out.println(st);
			}
		}
		
		System.out.println(count);

	}

}
