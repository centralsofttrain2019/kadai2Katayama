package service;

import java.util.ArrayList;
import java.util.List;

import bean.Employee;
import bean.EmployeeDispBean;

public class EmployeeService {



	public EmployeeDispBean getAllEmployee() {
		//次の画面で表示するための入れ物
		EmployeeDispBean bean1 = new EmployeeDispBean();
		List <Employee> employeeList = new ArrayList <Employee>();

		Employee e;
		e = new Employee();

		e.setName("hayahi");
		e.setBloodType("B");

		employeeList.add(e);

		e = new Employee();

		e.setName("katayama");
		e.setBloodType("A");

		employeeList.add(e);


		bean1.setEmployeeList(employeeList);

		return bean1;
	}

}
