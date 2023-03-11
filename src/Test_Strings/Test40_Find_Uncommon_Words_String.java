package Test_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test40_Find_Uncommon_Words_String {

	public static void main(String[] args) {
		
		String s1= "this apple is sweet";
		
		String s2= "this apple is sour";
		
		String[] stAr1 = s1.split("\\s");
		
		String[] stAr2 = s2.split("\\s");
		
		for(String s: stAr1) {
			if(s2.indexOf(s)==-1) {
				System.out.println(s);
			}
		}
		
		for(String s: stAr2) {
			if(s1.indexOf(s)==-1) {
				System.out.println(s);
			}
		}

	}

}
