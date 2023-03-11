package Arrays;

import java.util.*;

public class Count_Consistent_Strings {

	public static void main(String[] args) {
		
//https://leetcode.com/problems/count-the-number-of-consistent-strings/
		
			String[] stArr= {"ad","abd","aaab","baa","badab"}; 
			
			String allowed="ab";
			int count=0;
			
			for (String st1:stArr) {
				
				int index=st1.indexOf(allowed);
				//System.out.println(index);
				if (index!=-1) {
					System.out.println(st1);
					count++;
				}
			}
			
			System.out.println(count);
			
	}

}			
			/*
			
			int count=stArr.length;
			
			char[] chArr=allowed.toCharArray();
			
			HashSet<Character> hs=new HashSet<> ();
			
			for (Character c: chArr) {
				
				hs.add(c);
				
			}
			
			for (String st:stArr) {
				
				for (Character ch : st.toCharArray()) {
					
					if (!(hs.contains(ch))) {
						count --;
						break;
					}
					
				}
				
				
			}
			
			System.out.println(count);
			
				
			}

		}
/*

/* In a method:
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
          int count=words.length;
           HashSet<Character> map= new HashSet<>();
            for(char ch: allowed.toCharArray())
                    map.add(ch);
            for(String str: words)
                    for(char c: str.toCharArray())
                            if(!map.contains(c)){
                                    count--;
                                    break;
                            }
            return count;
    }
}
 */


