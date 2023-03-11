package Test_Strings;

public class Test36_String_unique_substrings_ServiceNOW {

	public static void main(String[] args) {
		
		String s="pwwkew";
		
		char[] chAr=s.toCharArray();
		
		StringBuilder sb=new StringBuilder();
		
		sb.append(s.charAt(0));
		for (int i=0;i<s.length();i++) {
			
			
			for (int j=i+1;j<s.length();j++) {
				
				if (sb.indexOf(String.valueOf(s.charAt(j)))==-1) {
				//if (sb.toString().indexOf(s.charAt(j))==-1) {
					
					
					sb.append(s.charAt(j));
					
					if (sb.length()>1) {
						System.out.println(sb.toString());
						
					}
					
				}
				else
				{
					
					sb=new StringBuilder();
					break;
				}
				
				
			}
		}
		
		

	}

}
