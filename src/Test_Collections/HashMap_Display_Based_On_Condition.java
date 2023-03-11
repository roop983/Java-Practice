package Test_Collections;
import java.util.*;

public class HashMap_Display_Based_On_Condition {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<> ();
		
		 map.put(27, "Raj");
		 map.put(25, "Simran");
		 map.put(18, "Sirisha");
		 map.put(45, "Kushal");
		 map.put(4, "Dhanraj");
		 
		 Iterator<Integer> it=map.keySet().iterator();
		 
		 while (it.hasNext()) {
			 
			 int age=it.next();
			 
			 if (age > 20) {
				 System.out.println(map.get(age));
			 }
		 }

	}

}
