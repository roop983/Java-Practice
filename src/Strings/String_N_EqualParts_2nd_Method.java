package Strings;

public class String_N_EqualParts_2nd_Method {

	public static void main(String[] args) {
		
		String st="abcdefgh";
		
		String res="";
		
		int N=2;
		
		
		
		if (st.length()%N!=0) {
			
			System.out.println("String cannot be divided");
		}
		else
		{
			int t=st.length()/N;
			for (int i=0;i<st.length();i=i+t) {
				
				System.out.print(st.substring(i,i+t)+"\n");
				//System.out.println();
			}
			
			
			
			
		}

	}

}
