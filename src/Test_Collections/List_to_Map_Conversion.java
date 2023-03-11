package Test_Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Students {
	
	int ID;
	String name;
	String major;
	
	
	public Students(int ID, String name, String major) {
		super();
		this.ID = ID;
		this.name = name;
		this.major = major;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		
		return ID +", " +name+" "+ major;
	}
	
	

	/*
	
	public Students(int ID, String name, String major) {
		
		super();
		this.ID=ID;
		this.name=name;
		this.major=major;
	}
	
	public int getID() {
		
		return ID;
	}
	
	public String getName() {
		
		return name;
	}
	public String getMajor() {
		
		return major;
	}
	
		*/
	
	
}

public class List_to_Map_Conversion {

	public static void main(String[] args) {
		
		List<Students> student=new ArrayList<Students> ();
		
		
		student.add(new Students(9,"Hari", "Science"));
		student.add(new Students(15,"Sid", "Arts"));
		student.add(new Students(20,"Arun", "Science"));
		student.add(new Students(30,"Badal", "Commerce"));
		
		Map<Integer, String> map=new HashMap<> ();
		
		for (Students st:student) {
			if (st.getID() > 10) {
			map.put(st.getID(), st.getName());
			}
		}
		
		System.out.println(map);
		
		//Another way of declaring Map with List as input
		
		Map<String, Students> map1=new HashMap<> ();
		
		map1.put("sachin", new Students(16,"Biswas", "Arts"));
		
		System.out.println(map1.get("sachin"));

	}

}
