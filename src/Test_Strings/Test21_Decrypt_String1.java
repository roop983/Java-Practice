package Test_Strings;

public class Test21_Decrypt_String1 {

	public static void main(String[] args) {
		
		/*Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
*/
		//String s="1326#";
		
		String s="10#11#12";
		StringBuilder sb=new StringBuilder();
		
		for (int i=0;i<s.length();i++) {
			
			if (i+2< s.length() && s.charAt(i+2) == '#') {
				
				
				sb.append((char)((Integer.parseInt(s.substring(i, i+2))-1) + 'a'));
				i=i+2;			
			}
			else
			{
				
				sb.append((char)(Integer.parseInt(String.valueOf(s.charAt(i))) -1 +'a'));
				//sb.append((char)(((int)s.charAt(i))-1 + 'a'));
				
				//char a=  (char)(((int)s.charAt(i))-1 + 'a');
				
			}
		}
		
		 System.out.println(sb.toString());

	}

}
