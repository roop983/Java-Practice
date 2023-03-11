package Test_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*aabbbcaadd = a2b3c1a2d2*/

public class Test44_Count_Letters {
	
	static void printAndCountLetters(String s) {
		 
//		int temp =0;
//		for(int i =0;i< s.length()-1;i++) {
//			if(s.charAt(i)!= s.charAt(i+1)) {
//				
//				String output = s.substring(temp, i+1);
//				System.out.print(output.charAt(output.length()-1)+""+output.length());
//				temp = i+1;
//			}	
//		}
//		String output = s.substring(temp);
//		System.out.print(output.charAt(output.length()-1)+""+output.length());
//	}
	
	//OR
	
	StringBuilder sb =new StringBuilder();
	String output ="";
		for(int i=0;i<s.length();i++) {
		
		if(sb.length() == 0 || s.charAt(i)==sb.charAt(sb.length()-1)) {
			sb.append(s.charAt(i));
		}
		else {
			System.out.print(sb.charAt(sb.length()-1)+""+sb.length());
			sb = new StringBuilder();
			sb.append(s.charAt(i));
		}
	}
		System.out.print(sb.charAt(sb.length()-1)+""+sb.length());
	
}

	


	public static void main(String[] args) {
		
		String input="aabbbcaadd";
		
		printAndCountLetters(input);		
		

	}

}
