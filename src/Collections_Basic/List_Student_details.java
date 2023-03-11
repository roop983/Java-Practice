package Collections_Basic;

import java.util.ArrayList;
import java.util.List;

class Student{
	
	int age;
	String name;
	String stream;
	
	Student (int age,String name, String stream) {
		
		this.age=age;
		this.name=name;
		this.stream=stream;
	}
	
}

public class List_Student_details {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Divya","Science");
		Student s2=new Student(102,"Shreya","Commerce");
		
		List<Student> list=new ArrayList<Student> ();
		
		list.add(s1);
		list.add(s2);
		
		for (Student st:list) {
			
			System.out.println(st.age+" "+st.name+" "+st.stream);
		}
		
		/*
		 while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.age+" "+st.name+" "+st.stream);  
  }  
		 */
		

	}

}
