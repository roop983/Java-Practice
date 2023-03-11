package Test_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
public class Anagram_Test_List {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
       
		a=a.toLowerCase();
		b=b.toLowerCase();
		//char[] ch1 = a.toCharArray();
		char[] ch2 =  b.toCharArray();
		int count =0;
		
		List<Character> list = new ArrayList<>();
		for (char c: ch2) {
			list.add(c);
		}
		for (int i = 0; i< a.length();i++) {
            for (int j = 0; j< list.size();j++) {
                if (a.charAt(i)==list.get(j)) {
                    count++;
                    list.remove(j);
                    break;
                }
            }
		}
        return count == a.length();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

}
