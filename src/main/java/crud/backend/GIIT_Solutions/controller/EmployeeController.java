package crud.backend.GIIT_Solutions.controller;

import crud.backend.GIIT_Solutions.dto.EmployeeDto;
import crud.backend.GIIT_Solutions.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
   private EmployeeService employeeService;

   @PostMapping
   //Build Add Employee REST API
    public ResponseEntity<EmployeeDto>createEmployee(@RequestBody EmployeeDto employeedto){
        EmployeeDto savedEmployee = employeeService.createEmployee(employeedto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}
