package Test_Strings;

public class Test9_Anagram {

	public static void main(String[] args) {
		String s1="anagram";
		String s2= "margana";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		int count=0;
		
		if (s1.length()!=s2.length()) {
			
			System.out.println("Strings are not anagram");
			
		}
			
			else {
				
				for(int i=0;i<s1.length();i++) {
					
					
					for (int j=0;j<s2.length();j++)
					{
						if (s1.charAt(i)==s2.charAt(j)) {
							count++;
							break;
						}
					}
				}
				
				if (count==s1.length()) 
					
					System.out.println("Strings are anagram");
				
				
				else
					System.out.println("Strings are not anagram");
			}

	}

}
