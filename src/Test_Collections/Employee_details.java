package Test_Collections;

public class Employee_details {

	
	int empID;
	String empName;
	int deptID;
	String status="active";
	int salary;
		
	public Employee_details(int empID, String empName, int deptID, String status, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.deptID = deptID;
		this.status = status;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getDeptID() {
		return deptID;
	}

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee Details : empID="+ empID+  ", empName=" +empName+ ", deptID=" +deptID+ ", status="+status+ ", "+status+", salary= "+salary;
	}

}
