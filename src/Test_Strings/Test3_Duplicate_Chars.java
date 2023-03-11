package Test_Strings;

public class Test3_Duplicate_Chars {

	public static void main(String[] args) {
		String str="Beginnersbookb";
		
		String str1=str.toLowerCase();
		
		char[] ch=str1.toCharArray();
		
		for (int i=0;i<ch.length;i++) {
			
			for (int j=i+1;j<ch.length;j++) {
			
					if (ch[i]==ch[j]) {
						
						System.out.println(ch[j]);
					}
		}

	}

}

}