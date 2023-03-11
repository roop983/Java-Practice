package Test_Strings;

import java.util.ArrayList;
import java.util.List;

public class Test37_Maximum_words_broken_keys2 {

	public static void main(String[] args) {
		
		/* https://leetcode.com/problems/maximum-number-of-words-you-can-type/
		  There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

Example 1:

Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
Example 3:

Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken.


		 */
		String text="abc de";
		
		String[] stAr=text.split("\\s");
		
		String brokenLetters="abc";
		
		StringBuilder sb = new StringBuilder();
		 int count =0;
		
		List<Character> list =new ArrayList<>();
		
		for (char c: brokenLetters.toCharArray()) {
			list.add(c);
		}
		
		for(String s: stAr) {
			for(char d: list) {
				sb = new StringBuilder();
				if(s.contains(String.valueOf(d))) {
					break;
				}
				else {
					sb.append(s);
				}
			}
			if(s.equals(sb.toString())) {
				count++;
				
			}
		}
		System.out.println(sb.toString());
		System.out.println(count);
		
		

	}

}
