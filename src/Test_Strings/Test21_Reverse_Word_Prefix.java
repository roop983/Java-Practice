package Test_Strings;

public class Test21_Reverse_Word_Prefix {

	public static void main(String[] args) {
		
		/*Input: word = "abcdefd", ch = "d"
				Output: "dcbaefd"
				Explanation: The first occurrence of "d" is at index 3. 
				Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd". */
		
		String word="abcd";
		
		char ch='c';
		
		String output="";
		
		String p1_rev=""; 
		
		/*
		int i=word.indexOf(ch);
		
		System.out.println(i);
		
		if (i !=-1) {
		String p1=word.substring(0, i+1);
		
		String p2=word.substring(i+1,word.length());
		
		for (int j=p1.length()-1;j>=0;j--) {
			p1_rev=p1_rev+p1.charAt(j);
		}
		output=output+p1_rev.concat(p2);
		System.out.println(output);
		}
		else
		{
			System.out.println(word);
		}
		
		
		*/
		
		StringBuffer sb=new StringBuffer();
		
		int i=word.indexOf(ch);
		//System.out.println(i);
		if (i !=-1) {
			
			sb.append(word.substring(0, i+1));
			sb.reverse();
			sb.append(word.substring(i+1,word.length()));
			System.out.println(sb.toString());
		}
		else
		{
			System.out.println(word);
		}
		
		/*
		String p1="";
		
		String p2="";
		
		String p1_rev="";
		
		String output="";
		
		
		if (test.contains(ch)) {
		for (int i=0;i<test.length();i++) {
			
			 p1=p1+test.charAt(i);
		//	 System.out.println(p1);
			
			if (test.charAt(i)==ch) {
				
				p2=test.substring((i+1),test.length());
				
				//System.out.println(p1);
				for (int j=p1.length()-1;j>=0;j--) {
					p1_rev=p1_rev+p1.charAt(j);
				}
				output=output+p1_rev.concat(p2);
				System.out.println(output);
				break;
			}
			
		
		}
		
		}
		else
		{
			System.out.println(test);
		}
		
		
		
		 //output=output+p1_rev.concat(p2);
		
		//System.out.println(output);
		 */

	}

}
