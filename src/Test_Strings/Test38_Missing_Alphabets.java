package Test_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test38_Missing_Alphabets {

	public static void main(String[] args) {
		
		//Java Program To Find Missing Alphabets In Given String
		//http://makeseleniumeasy.com/2018/08/24/frequently-asked-java-program-20-java-program-to-find-missing-alphabets-in-given-string/
		/*You need to find missing alphabets from a given string. E.g.
		User input: “Amod Mahajan”
	Output: [B, C, D, E, F, G, H, I, J, K, L, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, b, c, e, f, g, i, k, l, p, q, r, s, t, u, v, w, x, y, z]
	*/

		
		String check="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		
		String st="Amod Mahajan";
		
		st=st.replaceAll("\\s+", "");
		
		String s=check.replaceAll("["+st+"]", "");
		
		//s.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(s);
		
		
		
	//Another way	
		
		List<Character> list3=new ArrayList<> ();
		for (int i=0; i< check.length();i++) {
			
			if (!st.contains(String.valueOf(check.charAt(i)))) {
				
				//System.out.print(check.charAt(i)+",");
				
				list3.add(check.charAt(i));
			}
		}
		
		System.out.println(list3);
		
		//Another way using List
		
		List<String> list1=new ArrayList<> (Arrays.asList(check.split("")));
		
		
		List<String> list2=new ArrayList<> (Arrays.asList(st.split("")));
		
		
		list1.removeAll(list2);
		
		System.out.println(list1);
		
		

	}

}
