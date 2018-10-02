package main.java.bankappnew;

public class EmployeeService {
	private Employee emp;

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public void displayName() {
		
		System.out.println(emp.getName());
	}
}
