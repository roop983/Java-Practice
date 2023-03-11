package Test_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Duplicate_Characters {

	static void findDuplicateCharacter(String test) {
		 
		
		 Map<Character, Integer> map=new HashMap<> ();
		 
		 char[] chAr=test.toLowerCase().toCharArray();
		 
		 for (char c:chAr) {
			 
			 if (map.get(c)!=null) {
				 
				 map.put(c, map.get(c) + 1);
			 }
			 else
			 {
			 map.put(c, 1);
			 
			 }
			 
		 }
		 
	//	Integer c=map.get('a');
		//System.out.println(c);
		
		 System.out.println(map);
		 
		 Iterator<Character> it=map.keySet().iterator();
		 
		 while(it.hasNext()) {
			 
			 char temp=it.next();
			 
			 if (map.get(temp) > 1) {
				// System.out.println("The word "+ temp + " appeared "+ map.get(temp)+ " times");
				 System.out.println(temp);
			 }
			 
		 }
		
	}
	

	public static void main(String[] args) {
		
		String test="Beginnersbook";
		
		findDuplicateCharacter(test);
				

	}

}
