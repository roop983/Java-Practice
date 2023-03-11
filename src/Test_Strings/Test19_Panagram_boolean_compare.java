package Test_Strings;

public class Test19_Panagram_boolean_compare {

	public static void main(String[] args) {
		
		//panagram means: sentence should contains at least one of every letter of the English alphabet.
		
		String test="abcdefghijklmnopqrstuvwxyz";
		
		String s="thequickbrownfoxjumpsoverthelazydog"; 
		
		int count=0;
		
		for (int i=0;i<test.length();i++) {
			
			for (int j=0;j<s.length();j++) {
				
				if (test.charAt(i)==s.charAt(j))
				{
					count++;
					break;
				}
				
					
			}
			
		}
		
		Boolean b1=(count==26)?true:false;  
		
		System.out.println(b1);
	}

}
