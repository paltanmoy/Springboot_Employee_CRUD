package springboot.service;

import java.util.List;

import springboot.model.Employee;

public interface EmployeeService {

	public void createEmployee(Employee emp);
	public Employee findEmployeeById(Long id);
	public List<Employee> getAllEmployees();
	public void updateEmployeeRecord(Employee emp);
	public void deleteEmployee(Long empID);
}
