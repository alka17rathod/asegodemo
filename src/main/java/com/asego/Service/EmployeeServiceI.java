package com.asego.Service;

import com.asego.Exception.EmployeeException;
import com.asego.dto.EmployeeDto;
import com.asego.entity.Employee;

import java.util.List;

public interface EmployeeServiceI {
    EmployeeDto createemployee(EmployeeDto employeeDto);
    EmployeeDto singleAllEmployee(Integer id) throws EmployeeException;
   List<EmployeeDto> getAllEmployee();
}
