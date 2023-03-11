package Test_Strings;

public class Test8_Pallindrome {

	public static void main(String[] args) {
	 
		String st="Reer";
		String rev="";
		
		st=st.toLowerCase();
		
		
		for(int i=st.length()-1;i>=0;i--) {
			System.out.print(st.charAt(i));
			//rev=rev+st.charAt(i);
			//or
			rev=rev.concat(""+st.charAt(i));
			
		}
		System.out.println();
		
		if (st.equals(rev))
		System.out.print("String is Pallindrome");
		else
			System.out.print("String is not Pallindrome");

	}

}
