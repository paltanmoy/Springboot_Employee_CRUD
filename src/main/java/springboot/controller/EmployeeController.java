package springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.model.Employee;
import springboot.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
		
	@RequestMapping(value="/employee",method= RequestMethod.POST)
	public @ResponseBody Employee addEmployee(@RequestBody Employee employee){
		employeeService.createEmployee(employee);
		return employee;
	}
	
	@RequestMapping(value="/employee/{id}",method= RequestMethod.GET)
	public @ResponseBody Employee getEmployee(@PathVariable("id") Long employeeId){
		return employeeService.findEmployeeById(employeeId);
	}
	
	@RequestMapping(value="/employees",method= RequestMethod.GET)
	public @ResponseBody List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/employee/{id}",method= RequestMethod.DELETE)
	public @ResponseBody String deleteEmployee(@PathVariable("id") Long employeeId){
		employeeService.deleteEmployee(employeeId);
		return "{status:success}";
	}
	
	
}
