package Test_Strings;

import java.util.Arrays;

public class Test31_Strings_equal {

	public static void main(String[] args) {
		
		String s1="grab";
		String s2= "ragb";
		
		char[] chAr1=s1.toCharArray();
		
		char[] chAr2=s2.toCharArray();
		
		Arrays.sort(chAr1);
		
		Arrays.sort(chAr2);
		
		if (Arrays.compare(chAr1, chAr2)==0) 
			System.out.println("Strings have same content");
			else
			System.out.println("Strings do not have same content");
		
		
		

	}

}
