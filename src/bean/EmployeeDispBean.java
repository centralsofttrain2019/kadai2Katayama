package bean;

import java.util.List;

public class EmployeeDispBean
{
	private String message;
	private List <Employee> employeeList;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}


}

