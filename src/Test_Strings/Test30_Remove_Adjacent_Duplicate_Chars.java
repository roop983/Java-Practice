package Test_Strings;

public class Test30_Remove_Adjacent_Duplicate_Chars {

	public static void main(String[] args) {
		
		String s="abbaca";
		
		StringBuilder sb=new StringBuilder();
		
		for (int i=0;i<s.length();i++) {
			if ( sb.length() == 0||s.charAt(i)!=sb.charAt(sb.length()-1) ) {
				sb.append(s.charAt(i));
				//System.out.println(sb.toString());
			}
			else
			{
				sb.deleteCharAt(sb.length()-1);
				//System.out.println(sb.toString());
			}
			
		}
		
		System.out.println(sb.toString());
		

	}

}
