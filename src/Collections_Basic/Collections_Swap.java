package Collections_Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Swap {

	public static void main(String[] args) {
		
		List<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        
        System.out.println("Original List :\n" + c1); 
        
        Collections.swap(c1, 0, 2);
        
        System.out.println("Array list after swap: \n" +c1);
        
        System.out.println("Printing the elements as String:");
        //Printing the elements as String
        for(String b: c1){
            System.out.println(b);
           }


	}

}
