package Strings;


public class String_Subset {

	public static void main(String[] args) {
		String st="ABC";
		
		int len=st.length();

		
		//Total possible subsets for string of size n is n*(n+1)/2  
		String[] strArr=new String[len*(len+1)/2];
		
		for (int i=0;i<len;i++) {
			
			for (int j=i;j<len;j++) {
				
				String st1=st.substring(i,j+1);
				System.out.println(st1);
				
				
			}
		}
		
		
			

	}

}
