package Collections_Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSet_Remove_Duplicates {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<> ();
		
		list.add("Mango");
		list.add("Banana");
		list.add("Mango");
		list.add("Guava");
		list.add("Grapes");
		
		System.out.println(list.toString());
		
		Set<String> s = new LinkedHashSet<String>(list);  
        System.out.println(s); 
        
        
        Set<Character> s1 = new LinkedHashSet<Character> ();  
        
        String st="abbaca";
        
        char[] ch=st.toCharArray();
        
        for (char c:ch) {
        	
        	s1.add(c);
        }
        
        System.out.println(s1);
        
        
		

	}

}
