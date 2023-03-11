package Test_Strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test42_First_Pallindromic_String {

	public static void main(String[] args) {
		

		String[] stAr = {"abc","car","ada","racecar","cool"};
		
		LinkedList<String> list = new LinkedList<>();
		
		for (String s: stAr) {
			
			StringBuilder sb = new StringBuilder(s);
			if(s.equals(sb.reverse().toString())) {
				list.add(s);
			}
		}
		
		if(list.size()!=0) {
			System.out.println(list.getFirst());
		}
		else
		{
			System.out.println("\"\"");
		}

	}

}
