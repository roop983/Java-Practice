package Test_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Test27_Reverse_String_only_Vowels {

	public static void main(String[] args) {
		
		/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.*/
		String s="heaio";  
				  
		char[] vowels= {'a','e','i','o', 'u','A','E','I','O','U'};
		//String[] vowels= {"a", "e", "i", "o", "u"};
		
		
		List<Character> list=new ArrayList<> (); 
				
		for (char c:vowels) {
			list.add(c);
		}
		
		//String vowels="aeiou";
		//Use Char array
		
		//System.out.println(list);
		
		char[] chAr=s.toCharArray();
		
		char t;
		
		int j=0;
		
		for (int i=chAr.length-1;i>=0;i--) {
			
			
			while (j<i) {
						
				if (list.contains(chAr[i]) && list.contains(chAr[j])) {
						
						t=chAr[j];
						chAr[j]=chAr[i];
						chAr[i]=t;
						
						//System.out.println("inside");
						//System.out.println(chAr[i]);
						//System.out.println(chAr[j]);
						j++;
						break;  
						
					}
				
				else if (!list.contains(chAr[j])) {
					j++;
				}
				else if (!list.contains(chAr[i])) {
					break;
				}
				
				//break;
				
				
			}
			
				
				
				
			}
		
		
		for (int i=0;i<chAr.length;i++) {
			System.out.println(chAr[i]);
		}
		
		String s1=String.valueOf(chAr);
		System.out.println(s1);
		
		/*
		String rev="";
		int k=0;
		
		
		
		//String[] vowels= {"a", "e", "i", "o", "u"};
		
		for (int i=s.length()-1;i>=0;i--) {
			
			for (int j=k;j<s.length()-1;j++) {
				
				if (s.charAt(i)==vowels[j] && s.charAt(j)==vowels[j]) {
					
					rev=rev+s.charAt(i);
					break;
				}
				else
				{
					rev=rev+s.charAt(j);
				}
				k++;
			}
			
		}
		
		*/

	}

}
