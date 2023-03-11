package Test_Strings;

public class Test34_Last_word_String {

	public static void main(String[] args) {
		// https://leetcode.com/problems/length-of-last-word/
		/*Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.*/
		
		
		String s="   fly me   to   the moon  ";
		
		String s1=s.trim();
		
		String[] stAr=s.trim().split("\\s+");
		
		int len_Ar=stAr.length;
		
		int len_of_Lastword= stAr[len_Ar-1].length();
		
		System.out.println("Length of last word: "+stAr[len_Ar-1]+" is: "+len_of_Lastword);
		
		/*for (int i=0;i<stAr.length;i++) {
			
			System.out.println(stAr[i]);
		}*/

	}

}
