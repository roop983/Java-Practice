package Test_Strings;

import java.util.Arrays;

public class Test23_String_OddCharacterCounts {

	public static void main(String[] args) {
		// Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

//The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  
/* Ex: 1Input: n = 4
		Output: "pppz"
		Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once.
		 Note that there are many other valid strings such as "ohhh" and "love".
Ex: 2	Input: n = 7
Output: "holasss"
	*/
	
		int n=8;
		
	
		if (n%2==0) {
			
			for (int i=1;i<n;i++) {
				System.out.print("a");
			}
			System.out.print("b");
			
		}
		else {
			for (int i=1;i<=n;i++) {
				System.out.print("a");
			}
		}
		System.out.println();
		System.out.println("******");
		
		char[] ch=new char[n];
		
		Arrays.fill(ch,'a');
		/* OR
		for (int i=0;i<n;i++) {
			ch[i]='a';
		}
		*/
		if (n%2==0) {
		ch[0]='b';
		}
		
		System.out.println(String.valueOf(ch));
		
		/*
		System.out.println(new String(ch));
		
		for (int j=0;j<ch.length;j++)
		{
			System.out.print(ch[j]);
		}
		*/
		
		
	}

}
