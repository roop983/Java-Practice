package Test_Strings;

public class Test7_String_reversal {

	public static void main(String[] args) {
		
		String st="abcd";
	
		
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
			
			
		}
		
		System.out.println();
		
		StringBuilder sb =new StringBuilder(st);
		System.out.println(sb.reverse());

	}

}
