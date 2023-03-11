package Test_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test27_Reverse_String_only_Vowels_2nd_method {

	public static void main(String[] args) {
		
		String s="heaio";
		
		char[] chAr=s.toCharArray();
		
		List<Character> list=new ArrayList<> ();
		
		Collections.addAll(list, 'a', 'e', 'i', 'o', 'u', 'A','E', 'I','O','U');

		
		int i=0;
		int j=s.length()-1;
		char temp;
		
		while (i < j) {
			
			if (list.contains(chAr[i]) && list.contains(chAr[j])) {
				
				temp=chAr[i];
				chAr[i]=chAr[j];
				chAr[j]=temp;
				i++;
				j--;
			}
			else if (!list.contains(chAr[i])) {
				i++;
			}
			else if (!list.contains(chAr[j])) {
				j--;
			}
		}
		
		/*for (int i=0;i< chAr.length;i++) {
			System.out.println(chAr[i]);
		}*/
		
		s=String.valueOf(chAr) ;
		System.out.println(s);

	}

}
