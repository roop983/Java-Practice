package Test_Strings;

public class Test20_Pallindrom_Sentence {

	public static void main(String[] args) {
		
		/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

		Example 1:

			Input: s = "A man, a plan, a canal: Panama"
			Output: true
			Explanation: "amanaplanacanalpanama" is a palindrome.
			Example 2:

			Input: s = "race a car"
			Output: false
			Explanation: "raceacar" is not a palindrome.
			Example 3:

			Input: s = " "
			Output: true
			Explanation: s is an empty string "" after removing non-alphanumeric characters.
			Since an empty string reads the same forward and backward, it is a palindrome.
			
			*/
		
		//String s="0P";
		String s= "A man, a plan, a canal: Panama";
		
		//String st=s.replaceAll("\\s+", "").replaceAll(",", "").replaceAll(":", "");
		
		String st=s.replaceAll("\\s+", "").toLowerCase();
		
		System.out.println(st);
		
		//StringBuffer sb=new StringBuffer();
		
		String s1="";
		
		for (int i=0;i<st.length();i++) {
			
			if ((st.charAt(i) >= 'a' && st.charAt(i) <= 'z') || (st.charAt(i) >= '0' && st.charAt(i) <= '9')) {
				
				s1=s1+st.charAt(i);
			}
		}
		
		System.out.println(s1);
		
		//very good solution
		
		s.replaceAll("[^A-Za-z0-9]", "");
		
		/*
		String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
		*/
		
		
		String st_rev ="";
		
		for (int i=st.length()-1;i>=0;i--) {
			st_rev=st_rev+st.charAt(i);
		}
		
		//System.out.println(st);
		
		/*
		System.out.println(st_rev);
		
		Boolean flag=(st.equalsIgnoreCase(st))?true:false;
		
		System.out.println(flag);
		*/
		
		StringBuffer sb=new StringBuffer(s1);
		
		String st_rev1=sb.reverse().toString();
		
		System.out.println(st_rev1);
		
		Boolean flag1=(s1.equals(st_rev1))?true:false;
		
		System.out.println(flag1);
		
		

	}

}
