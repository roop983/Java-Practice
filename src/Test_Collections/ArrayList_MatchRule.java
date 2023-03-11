package Test_Collections;
import java.util.*;

class Items {  
	
	String gadgeType;
	String colour;
	String data;
	String ruleKey="color";
	String ruleValue="silver";
	

	public Items (String gadgeType,String colour, String data) {
		
		this.colour=colour;
		this.data=data;
		this.gadgeType=gadgeType;
		
	}
	
	
	
	
}  

public class ArrayList_MatchRule {

	public static void main(String[] args) {
		
		Items It1=new Items("phone","blue","pixel");
		Items It2=new Items("computer","silver","lenovo");
		Items It3=new Items("phone","gold","iphone");
		
		List<Items> list =new ArrayList<Items> ();
		
		list.add(It1);
		list.add(It2);
		list.add(It3);
		
		HashMap<String, List> hash_map1= new HashMap<String, List>();  
		 
		// hash_map1.put("phone", list.get(0));
		
		

	}

}
