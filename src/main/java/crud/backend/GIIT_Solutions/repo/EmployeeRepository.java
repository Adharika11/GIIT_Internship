package crud.backend.GIIT_Solutions.repo;

import crud.backend.GIIT_Solutions.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
//employeerepo will get methods to perform crud operations on employee db