package Test_Collections;
import java.util.*;

public class HashMap_Duplicate_Words {
	
	 static void findDuplicatewords(String test) {
		 
		
		 Map<String, Integer> map=new HashMap<> ();
		 
		 String[] stAr=test.split("\\s");
		 
		 for (String st:stAr) {
			 
			 if (map.get(st)!=null) {
				 
				 map.put(st, map.get(st) + 1);
			 }
			 else
			 {
			 map.put(st, 1);
			 
			 }
			 
		 }
		 
		
		 System.out.println(map);
		 
		 Iterator<String> it=map.keySet().iterator();
		 
		 while(it.hasNext()) {
			 
			 String temp=it.next();
			 
			 if (map.get(temp) > 1) {
				 System.out.println("The word "+ temp + " appeared "+ map.get(temp)+ " times");
			 }
			 
		 }
		
	}
	

	public static void main(String[] args) {
		
		String test="I am am learning Java Java Java";
		
		findDuplicatewords(test);
				

	}

}
