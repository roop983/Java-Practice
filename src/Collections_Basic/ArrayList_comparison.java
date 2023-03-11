package Collections_Basic;
import java.util.*;

public class ArrayList_comparison {

	public static void main(String[] args) {
		List<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        List<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
   
        int count=0;
        for (int i=0;i<c2.size();i++) {
        	
        if (c1.contains(c2.get(i))) {
        	System.out.println(c2.get(i));
        	count++;
        }
        }
        
        System.out.println(count);
        
        System.out.println("*******");
      
        
        ArrayList<String> c3= new ArrayList<String>();
        
        for (String e : c1) {
        	
        	c3.add(c2.contains(e) ? "Yes":"No");
        }
        
        System.out.println(c3);
	}

}
