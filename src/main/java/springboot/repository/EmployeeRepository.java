package springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import springboot.model.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
