package Test_Strings;

public class Test36_String_unique_substrings_ServiceNOW2 {

	public static void main(String[] args) {
		
		String s="pwwkew";
		
		//char[] chAr=s.toCharArray();
		
		
		for (int i=0;i<s.length();i++) {
			
			
			for (int j=i+1;j<s.length();j++) {
				
				if(s.charAt(j-1)!=s.charAt(j) && s.charAt(i)!=s.charAt(j)) {
					System.out.println(s.substring(i, j+1));
				}
				else
					//i++;
					break;
					
				}
			
			}
		
		
		

	}

}
