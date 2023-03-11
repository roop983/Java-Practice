package Test_Collections;
import java.util.*;

import java.util.HashMap;
import java.util.Map.Entry;

public class Person_Details {

	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<> ();
		
		int count=0;
		
		 map.put("person01", "US");
		 map.put("person02", "UK");
		 map.put("person03", "UK");
		 map.put("person04", "US");
		 map.put("person05", "US");
		 
		 Iterator<Entry<String, String>> it_map= map.entrySet().iterator();
		 
		 while (it_map.hasNext()) {
			 
			 Entry<String,String> en=it_map.next();
			 
			 if (en.getValue().equals("US")) {
				 
				 count=count+1;
				 System.out.println(en.getKey());
			 }
		 }
		 
		 System.out.println(count);

	}

}
