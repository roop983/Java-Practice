package Test_Strings;

public class Test1_Char_Frequency {

	public static void main(String[] args) {
		
		String test="Welcome to Javatpoint portal";
		
		char c='t';
		
		int count=0;
		
		for (int i=0;i<test.length();i++) {
			
			if (test.charAt(i)==c) {
				count++;
			}
		}
		
		System.out.println("Frequency of character: "+c+" is "+count);

	}

}
