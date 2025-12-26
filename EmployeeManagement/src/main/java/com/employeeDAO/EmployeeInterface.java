package com.employeeDAO;

import java.util.List;

import com.employeedto.Employee;
import com.employeedto.EmployeeDelete;
import com.employeedto.EmployeeLogin;

public interface EmployeeInterface {
	public String insertEmployee(Employee e);
	public String selectEmployee(EmployeeLogin el);
	public String updateEmployee(Employee e);
	public String deleteEmployee(EmployeeDelete ed);
	public List<Employee> getAllEmployees();

}
