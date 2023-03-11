package Strings;

public class CharAt_OddEvenIndex {

	public static void main(String[] args) {
		String test="Welcome baby";
		
		int length=test.length();
		
		for (int i=0;i<length;i=i+2) {
			
			System.out.println("Character at Even index "+i+" is: "+test.charAt(i));
		}
		
		System.out.println("***********");
		
		
         for (int j=1;j<length;j=j+2) {
			
			System.out.println("Character at Odd index "+j+" is: "+test.charAt(j));
		}
		
		

	}

}
