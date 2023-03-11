package Test_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Employee {
	
	private String name;
	String major;
	private int age;
	
	 Employee(String name, String major, int age) {
		this.name=name;
		this.major=major;
		this.age=age;
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String toString() {
		return "Name is: "+name+" Major is: "+major+" Age is: "+age;
	}
	
	
}

public class List_Employees_Age_Condition {
	

	public static void main(String[] args) {
		List<Employee> list =new ArrayList<Employee> ();
		
		
		
		Employee e1=new Employee("Raj","Science",30);
		Employee e2=new Employee("Manvir","Commerce",25);
		Employee e3=new Employee("Sneha","Science",18);
		
		e1.setName("Ravichandran");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);

		Iterator<Employee> it=list.iterator();
		
		while (it.hasNext()) {
			
			Employee emp=it.next();
			
			if (emp.getAge() > 25) {
				System.out.println(emp.getName() + " "+ emp.major);
			}
		}
		
	}

}
