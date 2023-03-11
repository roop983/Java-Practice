package Test_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_Adjacent_Duplicate_chars_2nd_approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> list=new ArrayList<> ();
		
		String s="abbaca";
		
		int count=2;
		
		char[] chAr=s.toCharArray();
		
		for (char c:chAr) {
			list.add(c);
		}
		
		int i=0;
		
		while (i<list.size()-1)	{
			for (i=0;i<list.size()-1;i++) {
				
				if (list.get(i)==list.get(i+1)) {
					list.remove(i);
					list.remove(i);
					break;
				}
			
		}
			
		}
		
			System.out.println(list);	
		
		
		/*
		
		int i=0;
		
		
		
		System.out.println(list);
		
		int temp=1;
		
		while (i!=chAr.length-2) {
		for ( i=0;i<chAr.length-1;i++) {
			
			if (chAr[i]==chAr[i+1]) {
			list.remove(chAr[i]);
			list.remove(chAr[i+1]);
			
			break;
			}
			
			
		}
		} 
		
		System.out.println(list);
		*/
	}

}
