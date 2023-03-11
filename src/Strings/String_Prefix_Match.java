package Strings;

import java.util.Arrays;

public class String_Prefix_Match {

	public static void main(String[] args) {
		
		String s1="flower";
		
		String s2="flow";
		
		String s3="flight";
		
	
		String[] st= {"flower","flow", "flight" };
		/*
		Arrays.sort(st);
		
		for (int i=0;i<st.length;i++) {
			System.out.println(st[i]);
			
			
		}*/
		
		
		
		String first =st[0];
		int temp=1;
		
		for (int i=1;i<st.length;i++) {
			
			if (st[i].substring(0,temp).equals(first.substring(0,temp))) {
				
			}
		}
		
		for (int i=0;i<st.length;i++) {
		
		if (s1.substring(0, 2).equals(s2.substring(0, 2)) && s1.substring(0, 2).equals(s3.substring(0, 2))) {
			
			System.out.println(s2.substring(0, 2));
		}
		}

	}

}
