package Strings;

import java.util.HashMap;
import java.util.Map;

public class HashMapOccurences_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1="beginnersbook   test";
		
		String test=test1.replaceAll("\\s+",""); 
		
		int length=test.length();
		char[] ch = test.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c: ch) {
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}else {
				hm.put(c,  1);
			}
		}
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println("Occurence of character "+m.getKey()+ " is "+m.getValue());
		}
	
	}

}
