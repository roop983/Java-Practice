package Collections_Basic;
import java.util.*;

public class HashSet_to_Array {

	public static void main(String[] args) {
		
		HashSet<String> h_set=new HashSet<> ();
		
		 h_set.add("Red");
         h_set.add("Green");
         h_set.add("Black");
         h_set.add("White");
         h_set.add("Pink");
         h_set.add("Yellow");
     System.out.println("Original Hash Set: " + h_set);
     
     String[] stArr=h_set.toArray(new String[h_set.size()]);
     
     System.out.println("Array : "+stArr); // Cannot Display the Array - Remember it
     
  // Displaying Array elements
     System.out.println("Array elements: ");
      for(String element : stArr){
        System.out.println(element);
     }

	}

}
