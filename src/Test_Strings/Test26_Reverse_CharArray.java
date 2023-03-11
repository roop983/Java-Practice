package Test_Strings;

public class Test26_Reverse_CharArray {

	public static void main(String[] args) {
		
		/*
		  Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
		Input: s = ["h","e","l","l","o"]
		Output: ["o","l","l","e","h"]
	*/
		char[] chAr= {'h','e','l','o','s'};
	
		
		char[] chRev=new char[chAr.length];
		
		StringBuilder sb=new StringBuilder();
		int j=0;
			for (int i=chAr.length-1;i>=0;i--) {
			
			sb.append(chAr[i]);
		}
			
		System.out.println(sb.toString());
		
		/**********/
		int n;
		if ((chAr.length%2)==0)
		{
			n=chAr.length/2;
		}
		else
		{
			n=(chAr.length-1)/2;
		}
		
		System.out.println(n);
		//int t=chAr[chAr.length-1];
		char t;
		for (int i=chAr.length-1;i>=n;i--) {
			
			t=chAr[i];
			chAr[i]=chAr[j];
			chAr[j]=t;
			j++;
			//System.out.print(chAr[i]);
		}
		
		for (int i=0;i<chAr.length;i++) {
			System.out.println(chAr[i]);
		}
		
		//BEST Solution
		
		/*
		public class Solution {
		    public String reverseString(String s) {
		        char[] word = s.toCharArray();
		        int i = 0;
		        int j = s.length() - 1;
		        while (i < j) {
		            char temp = word[i];
		            word[i] = word[j];
		            word[j] = temp;
		            i++;
		            j--;
		        }
		        return new String(word);
		    }
		}
		
		*/
		

	}

}
