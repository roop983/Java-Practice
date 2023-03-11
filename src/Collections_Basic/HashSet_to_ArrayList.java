package Collections_Basic;
import java.util.*;

public class HashSet_to_ArrayList {

	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		   // use add() method to add values in the hash set
		          h_set.add("Red");
		          h_set.add("Green");
		          h_set.add("Black");
		          h_set.add("White");
		          h_set.add("Pink");
		          h_set.add("Yellow");
		      System.out.println("Original Hash Set: " + h_set);
		    
		  List<String> list=new ArrayList (h_set);  
		  
		  // Display ArrayList elements
		     System.out.println("ArrayList contains: "+ list);
		  


	}

}
