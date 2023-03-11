package Collections_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Sort {

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
        c2.add("White");
        

        boolean flag=c1.equals(c2);
        System.out.println(flag);
        
        Collections.sort(c1);
        Collections.sort(c2);
        
         flag=c1.equals(c2);
        System.out.println(flag);
        
       

	}

}
