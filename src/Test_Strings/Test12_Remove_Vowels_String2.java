package Test_Strings;
import java.io.*;
import java.util.*;

public class Test12_Remove_Vowels_String2 {

	public static void main(String[] args) {
		String st="This is an apple";
		
		Character[] vowelArr= {'a', 'e', 'i', 'o', 'u'};
		
		List<Character> list = new ArrayList<>();
		list = Arrays.asList(vowelArr);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<st.length();i++) {
			if(!list.contains(st.charAt(i))) {
				sb.append(st.charAt(i));
			}
		}
		
		System.out.println(sb.toString());	


	}

}
