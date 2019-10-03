package day4;

public class Department extends Employee {
	
	int D_id;
	String D_name;
	
	
	public void setData(int employeeId, String employeeName, int i, String n) {
		setEmployee(employeeId, employeeName);
		D_id = i;
		D_name = n;
	}
	
	public void displayData() {
		displayEmployee();
		System.out.println("DepartMent Id: "+D_id+ "Department Name: "+D_name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department();
		obj.setData(101, "Parshant", 1101, "FOS");
		obj.displayData();
		
	}

}
