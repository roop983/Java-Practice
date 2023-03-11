package Strings;

public class String_Subset_Array {

	public static void main(String[] args) {
		String st="ABC";
		
		int len=st.length();
		int temp=0;
		
		//Total possible subsets for string of size n is n*(n+1)/2  
		String[] strArr=new String[len*(len+1)/2];
		
		for (int i=0;i<len;i++) {
			
			for (int j=i;j<len;j++) {
				
				strArr[temp]=st.substring(i,j+1);
				temp++;
				
			}
		}
		
		for (int i=0;i<strArr.length;i++) {
			
			System.out.println(strArr[i]);
		}
			

	}

}
