package Strings;

import java.util.ArrayList;

public class ArrayList_StringEquals {

	public static void main(String[] args) {
		
		String s1="abc";
		
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("xyz");
		list.add("123");
		list.add("abc");
		
		int count=0;
		for (String str:list) {
			if (str.equals(s1)) {
				
				count++;
				//System.out.println("Match found");  
			}
		}
		
		System.out.println("No: of Matches found for "+s1+" is "+count);  
	

	}

}
