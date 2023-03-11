package Strings;

public class String_N_EqualParts {

	public static void main(String[] args) {
		
		String st="abcdefgh";
		
		int length=st.length();
		
		System.out.println(length);
		
		int n=4, temp=0;
	
		
		
		int d=length/n;
		
		if (length%n !=0) {
			
			System.out.println("String cannot be divided into equal parts");
		}
		
		else {
		
		for (int i=0;i<n;i++) {
			
		
			for ( int j=0;j<d;j++) {
				
				System.out.print(st.charAt(temp));
				temp++;
				
				
			}
			System.out.println();
			
		}
		
		}

	}

}
