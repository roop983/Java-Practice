package Test_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class List_to_Map_conversion_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> student=new ArrayList<Students> ();
		
		student.add(new Students(9,"Hari", "Science"));
		student.add(new Students(15,"Sid", "Arts"));
		student.add(new Students(20,"Arun", "Science"));
		student.add(new Students(30,"Badal", "Commerce"));
		
		student.forEach(item -> System.out.println(item));
		
		Map <Integer, Students> stMap= new HashMap<> ();
		
	stMap=student
			  .stream()
			  .collect(Collectors.toMap(item -> item.getID(), item->item));
		
		/*stMap=student
				  .stream()
				  .collect(Collectors.toMap(item -> item.getID(), item->item.getName())); */
		
		
		stMap.forEach((key,value)->
		System.out.println("ID: "+key+" Students: "+value));
		
		System.out.println("*************");
		System.out.println("Name of Students in Science: ");
		Iterator<Students> it=student.iterator();
		
		while (it.hasNext()) {
			
			Students st=it.next();
			
			if (st.major.equals("Science")) {
				System.out.println(st.name);
			}
		}
		
		

	}

}
