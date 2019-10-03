package day4;

public class Employee {
	
	int e_id;
	String e_name;
	
	public void setEmployee(int employeeId, String employeeName) {
		e_id=employeeId;
		e_name = employeeName;
	}
	
	public void displayEmployee() {
		System.out.println("ID: "+e_id+ "Employee Name: "+e_name);
	}
}
