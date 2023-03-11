package Test_Strings;

public class Test11_Split_balanced_strings_2nd_Method {

	public static void main(String[] args) {
		
		String st="LRRRLL";
		
		StringBuilder sb=new StringBuilder();
		
		char c=st.charAt(0);
		
		int count=0;
		
		for (int i=0;i<st.length();i++) {
			
			if (st.charAt(i)==c) {
				sb.append(st.charAt(i));
				count++;
			}
			else
			{
				sb.append(st.charAt(i));
				count--;
				
			}
			
			if (count==0) {
				System.out.println(sb.toString());
				sb=new StringBuilder();
			}
		}

	}

}
