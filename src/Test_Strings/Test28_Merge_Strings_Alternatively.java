package Test_Strings;

public class Test28_Merge_Strings_Alternatively {

	
	public static void main(String[] args) {
		
		/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.*/
		
		String s1="pqrs";
		String s2="ab";
		String s3="";
		
//		int l1=s1.length();
//		
//		int l2=s2.length();
//
//		int small=l1<l2?l1:l2;
//
//		if (s1.length()>s2.length()) {
//		 s3=s1.substring(small);
//		
//		}
//		else
//			s3=s2.substring(small);
//		
//		StringBuilder sb=new StringBuilder();
//		
//		for (int i=0;i<small;i++) {
//				
//				sb.append(s1.charAt(i)).append(s2.charAt(i));
//			}
//				
//		sb.append(s3);
//		System.out.println(sb.toString());
		
		//return sb.append(s3).toString();
		
		String big ="";
		String small ="";
		
		if(s1.length() < s2.length()) {
			small = s1;
			big = s2;
			
		}
		else
		{
			small = s2;
			big = s1;
			
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<small.length();i++) {
			sb.append(big.charAt(i)).append(small.charAt(i));
		}
		sb.append(big.substring(small.length()));
		
		System.out.println(sb.toString());
		
		
	}

}
