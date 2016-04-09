package springboot.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.model.Employee;
import springboot.repository.EmployeeRepository;

@Repository
public interface JpaEmployeeRepository extends JpaRepository<Employee, Long>, EmployeeRepository{

}
