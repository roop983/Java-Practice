package Test_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Sort_Sentence {

	public static void main(String[] args) {
		
		String test="is2 sentence4 This1 a3";
		
		String[] array=test.split(" ");
		
		String result="";
		
		String[] array1=new String[array.length];
		
		Map<Character, String> map=new HashMap<> ();
		
		for (String st:array) {
			
			int len=st.length();
			char key=st.charAt(len-1);
			
			String value=st.substring(0,len-1);
			map.put(key, value);
		}
		
		System.out.println(map);
		
		
		
		List<Character> list=new ArrayList(map.keySet());
		
		Collections.sort(list);
		
		StringBuilder sb=new StringBuilder();
		
		for (int i=0;i<list.size();i++) {
			
			// result=result+map.get(list.get(i))+" "; 
			sb.append(map.get(list.get(i))).append(" ");
		}
		
		//System.out.println(result.trim());
		
		System.out.println(sb.toString().trim());

	}

}
