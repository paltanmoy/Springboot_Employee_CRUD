package springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.model.Employee;
import springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Override
	public void createEmployee(Employee emp) {
		employeeRepo.save(emp);

	}

	@Override
	public Employee findEmployeeById(Long id) {
		return employeeRepo.findOne(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public void updateEmployeeRecord(Employee emp) {
		employeeRepo.save(emp);
	}

	@Override
	public void deleteEmployee(Long empID) {
        employeeRepo.delete(empID);
	}

}
