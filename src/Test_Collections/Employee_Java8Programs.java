package Test_Collections;
import java.util.*;
import java.util.stream.Collectors;

public class Employee_Java8Programs {

	public static void main(String[] args) {
		
		List<Employee_details> empList=new ArrayList<> ();
		
		//Adding 7 employee details objects 
		empList.add(new Employee_details(10,"Raji", 101,"active", 2000));
		empList.add(new Employee_details(11,"Aman", 101,"active", 5000));
		empList.add(new Employee_details(12,"Veer", 102,"inactive", 6000));
		empList.add(new Employee_details(13,"Shiv", 102,"active", 4000));
		empList.add(new Employee_details(14,"Raju", 103,"inactive", 5000));
		empList.add(new Employee_details(15,"Boby", 103,"active", 3500));
		empList.add(new Employee_details(16,"Shin", 104,"inactive", 3500));
		
		
		//print emp details based on department
		
		Map<Integer, List<Employee_details>> empListBasedOnDept = empList.stream().collect(Collectors.groupingBy(Employee_details::getDeptID, Collectors.toList()));
		
		
		empListBasedOnDept.entrySet().forEach(entry -> 
		{
			System.out.println("For Dept No: "+entry.getKey()+"------"+entry.getValue());
		});
		
		System.out.println("*********************");
		//count employees based on department
		
		Map<Integer, Long> empCountDept=empList.stream().collect(Collectors.groupingBy(Employee_details::getDeptID, Collectors.counting()));

		empCountDept.entrySet().forEach(entry -> 
		{
			System.out.println("In Dept: "+entry.getKey()+"--"+"Employee count is: "+entry.getValue());
		});
		
		System.out.println("*********************");
		
		//count active and inactive employees in the collection
		
		Long activeEmpCount=empList.stream().filter(e -> "active".equals(e.getStatus())).count();
		Long inactiveEmpCount=empList.stream().filter(e -> "inactive".equals(e.getStatus())).count();
		
		System.out.println("Active Employee count: "+ activeEmpCount);
		System.out.println("InActive Employee count: "+ inactiveEmpCount);
		
		
		System.out.println("*********************");
		
		// Find min and max salary
		
		//Optional is a container object which may or may not contain a non-null value. 
		//Its used as a return value for respective getter methods.
		Optional<Employee_details> max_sal=empList.stream().max(Comparator.comparing(Employee_details::getSalary));
		Optional<Employee_details> min_sal=empList.stream().min(Comparator.comparing(Employee_details::getSalary));
		
		
		System.out.println(max_sal);
		System.out.println(min_sal);
		
		
		
		
		
}
	
}	
