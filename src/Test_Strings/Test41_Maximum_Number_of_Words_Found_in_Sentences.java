package Test_Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test41_Maximum_Number_of_Words_Found_in_Sentences {
	
//	https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
//		A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//
//		You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//
//		Return the maximum number of words that appear in a single sentence.
//		Example 1:
//
//		Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
//		Output: 6
//		Explanation: 
//		- The first sentence, "alice and bob love leetcode", has 5 words in total.
//		- The second sentence, "i think so too", has 4 words in total.
//		- The third sentence, "this is great thanks very much", has 6 words in total.
//		Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.

	public static void main(String[] args) {
		
		String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
//		List<Integer> list = new ArrayList<>();
//		for (String s: sentences) {
//			String[] stAr = s.split("\\s");
//			list.add(stAr.length);
//		}
//		Collections.sort(list);
//		System.out.println(list.get(list.size()-1));
		
		Map<Integer, String> map = new HashMap<>();
		
		for (String s: sentences) {
			String[] stAr = s.split("\\s");
			map.put(stAr.length, s);
		}
		
		List<Integer> list = new ArrayList(map.keySet());
		
		Collections.sort(list);
		
		System.out.println("The largest sentence is "+map.get(list.get(list.size()-1))+" and its length is "+list.get(list.size()-1));
		

	}

}
