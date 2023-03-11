package Test_Strings;

public class Test11_Split_balanced_strings2 {

	public static void main(String[] args) {
		
		String st="LRRLRRLL";
		
		int count =0;
		
		int temp=0;
		
		char c = st.charAt(0);
		
		for (int i =0;i<st.length();i++) {
			if(st.charAt(i)==c) {
				count++;
			}
			else {
				count--;
			}
			if(count ==0) {
				System.out.println(st.substring(temp, i+1));
				
				temp =i+1;
			}
		}
	}

}
