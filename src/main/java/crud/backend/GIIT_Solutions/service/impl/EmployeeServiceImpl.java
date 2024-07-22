package crud.backend.GIIT_Solutions.service.impl;

import crud.backend.GIIT_Solutions.dto.EmployeeDto;
import crud.backend.GIIT_Solutions.entity.Employee;
import crud.backend.GIIT_Solutions.mapper.EmployeeMapper;
import crud.backend.GIIT_Solutions.repo.EmployeeRepository;
import crud.backend.GIIT_Solutions.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
       Employee employee=EmployeeMapper.maptoEmployee(employeeDto);
       Employee savedEmployee=employeeRepository.save(employee);


       return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
