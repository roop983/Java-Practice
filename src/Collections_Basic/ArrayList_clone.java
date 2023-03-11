package Collections_Basic;
import java.util.*;

public class ArrayList_clone {

	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: \n" + c1);
        
        
        
        ArrayList<String> c2=(ArrayList) c1.clone();
        
        System.out.println("Cloned array list: \n" + c2);

	}

}
