package com.asego.Service;

import com.asego.Exception.EmployeeException;
import com.asego.Repo.EmployeeRepo;
import com.asego.dto.EmployeeDto;
import com.asego.entity.Employee;
import com.asego.mapper.EmployeeMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Lazy

public class EmployeeServiceImpl implements EmployeeServiceI {


    private EmployeeServiceI employeeService;

    @Autowired
    public void setEmployeeService(EmployeeServiceI employeeService) {
        this.employeeService = employeeService;
    }

    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private EmployeeMapper employeeMapper;


    public Employee dtoToEntity(EmployeeDto employeeDto) {
        Employee emp = mapper.map(employeeDto, Employee.class);
        return emp;
    }

    public EmployeeDto entityToDto(Employee employee) {
        EmployeeDto dto = mapper.map(employee, EmployeeDto.class);
        return dto;
    }

    public Employee EmpDtoToEntity(EmployeeDto dto) {
        Employee emp = this.mapper.map(dto, Employee.class);
        return emp;
    }

    public EmployeeDto empEntiyToDto(Employee emps) {
        EmployeeDto dto = this.mapper.map(emps, EmployeeDto.class);
        return dto;

    }

    @Override
    public EmployeeDto createemployee(EmployeeDto employeeDto) {
        Employee emps = this.EmpDtoToEntity(employeeDto);
        Employee saved = employeeRepo.save(emps);
        return empEntiyToDto(saved);
    }

    @Override
    public EmployeeDto singleAllEmployee(Integer id) throws EmployeeException {

        Employee emp = this.employeeRepo.findById(id).orElseThrow(() -> new EmployeeException("not present"));

        return this.mapper.map(emp, EmployeeDto.class);
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> emp = employeeRepo.findAll();

        List<EmployeeDto> employeeDto = emp.stream().map(employees -> {
            EmployeeDto dto = new EmployeeDto();
            dto.setName(employees.getName());
            dto.setPhoneNo(employees.getPnoneNo());
            dto.setMailId(employees.getMailId());
            dto.setEmployeeCode(employees.getEmployeeCode());
            dto.setUserName(employees.getUserName());
            return dto;
        }).collect(Collectors.toList());


        return employeeDto;
    }


}

