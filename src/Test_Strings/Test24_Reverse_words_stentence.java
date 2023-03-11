package Test_Strings;

public class Test24_Reverse_words_stentence {

	public static void main(String[] args) {
		
		String s="Let's take LeetCode contest";
		
		String[] stAr=s.split("\\s");
		
		//String rev="";
		StringBuilder sb=new StringBuilder();
		
		for (String st:stAr) {
					
			for (int i=st.length()-1;i>=0;i--) {
				//rev=rev+st.charAt(i);
				sb.append(st.charAt(i));
				
			}
			//rev=rev+" ";
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
	

	}
/*
	class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (String word : words)
            sb.append(" ").append(reverse(word));
        return sb.toString().substring(1);
    }
    static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
    
    */

}
