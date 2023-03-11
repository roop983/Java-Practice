package Test_Collections;
import java.util.*;

//String has 2 characters repeated many times. Check whether the number of characters are same. Return true or false
public class Map_Char_occurences {

	public static void main(String[] args) {
		
		String test1="mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";
		
		//String test1="aaaabbccaabbcccaabbbbccaabbccc";
		Map<Character, Integer> map=new HashMap<> ();
		
		char[] chAr=test1.toCharArray();
		
		for (char c:chAr) {
			if (map.get(c)!=null) {
				map.put(c, map.get(c)+1);
			}
			else
				map.put(c, 1);
		}
		

		// map.forEach((k,v) -> System.out.println("key="+k+" , "+"value="+v));
		
		int in=map.get(chAr[0]);
		System.out.println(in);
		 int count=0;
		
		 
		Iterator<Character> it=map.keySet().iterator();
		
		while (it.hasNext()) {
			
			char temp=it.next();
			
//			if (!map.get(temp).equals(in)) {
//				count++;
//			}
			
			if (map.get(temp) == in) {
				count++;
			}
			
			
		}
		
		/*
		 
		 for (Map.Entry m: map.entrySet()) {
			   
			   if(!m.getValue().equals(in)) {
				   count++;
			   }
		   }
		
		*/
//		Boolean flag=(count==0)?true:false;
//		System.out.println(flag);
		
		Boolean flag=(count==map.size())?true:false;
		System.out.println(flag);
		
		

	}

}
