package Test_Strings;

import java.util.ArrayList;
import java.util.List;

public class List22_String_Halves_Alike {

	public static void main(String[] args) {
		
		String s="AbCdEfGh";
		int len=s.length();
		
		char[] vowels= {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		
		/*List<String> list=new ArrayList<> ();
		
		list.add(s.substring(0, len/2));
		list.add(s.substring(len/2));
		
		*/
		
		String s1=s.substring(0, len/2);
		String s2=s.substring(len/2);
		
		//int i=0,j=0;
		int count1=0, count2=0;
		
		for (char c: vowels) {
			for (int i=0;i<s1.length();i++) {
				
				if (s1.charAt(i)==c) {
					count1++;
					
				}
			}
				
			
			for (int j=0;j<s2.length();j++) {
				
				if (s2.charAt(j)==c) {
					count2++;
					
				}
			}
			
		}
		
		System.out.println((count1==count2)?true:false);

	}

}
