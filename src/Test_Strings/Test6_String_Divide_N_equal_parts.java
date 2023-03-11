package Test_Strings;

public class Test6_String_Divide_N_equal_parts {

	public static void main(String[] args) {
		
		String st="abcdefgh";
		
		int n=2;
		
		int temp=0;
		
		int st_len=st.length();
		
		int d=st_len/n;
		
		if ((st_len%n)!=0) {
			
			System.out.println("String cannot be divided");
			
		}
		else 
		{
				for (int i=0;i<n;i++) {
					
					for(int j=0;j<d;j=j++) {
						
						System.out.print(st.charAt(temp));
						temp++;
					}
					System.out.println();
				}
				
		}
		

	}

}
