package Test_Strings;

public class Test5_Last_Repeated_Char {

	public static void main(String[] args) {
		String str="botbo";
		
		String str1=str.toLowerCase();
		
		char[] ch=str1.toCharArray();
		
		char[] ch1;
		
		for (int i=ch.length-1;i>=0;i--) {
			
			int count=1;
			
			for (int j=i-1;j>=0;j--) {
			
					if (ch[i]==ch[j]) {
						count++;
						
					}
					
		}
			
			if (count>1) {
				
				System.out.println(ch[i]);
				break;
			}

	}

}

}