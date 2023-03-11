package Strings;

import java.util.Scanner;

public class String_Reverse_and_Pallindrome {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a string:");
		
		String st=scan.nextLine();
		
		st=st.toLowerCase();
		
		//String rev="";
		
		StringBuilder rev=new StringBuilder();
		
		int len=st.length();
		
		for (int i=len-1;i>=0;i--) {
			rev.append(st.charAt(i));
		}
		
		System.out.println(rev.toString());
		
		System.out.println(st);
		
		if (st.equals(rev.toString())) {
			
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
			
		}
		//OR
		System.out.println("************");
		StringBuilder rev1=new StringBuilder(st);
		rev1.reverse();
		
		if(rev1.toString().equals(st)) {
			System.out.println("String is Pallindrome");
		}
		else {
			System.out.println("String is not Pallindrome");
			
		}
		
		System.out.println("************");
		
		//Simplest method for reverse
		
		String s1 = "This is Java";
		String s2 = "";
		for (int i =0; i<s1.length();i++) {
			s2 = s1.charAt(i) + s2;
		}
		System.out.println(s2);
		

	}

}
