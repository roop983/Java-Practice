package Test_Strings;

public class Test10_Subset {

	public static void main(String[] args) {
		
		String st="ABC";
		
		int len=st.length();
		
		int temp=0;
		
		//Total subsets for String of size n can be n*(n+1)/2
		
		String[] stAr=new String[len*(len+1)/2];
		
		for (int i=0;i<len;i++) {
			
			for (int j=i;j<len;j++) {
				
				stAr[temp]=st.substring(i,j+1);
				temp++;
				//System.out.println(stAr[temp]);
			}
						
	
		}
		
		for (int i=0;i<stAr.length;i++) {
			
			System.out.println(stAr[i]);
		}
		
		
				

	}

}
