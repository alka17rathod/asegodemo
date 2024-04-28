package com.asego.mapper;

import com.asego.dto.EmployeeDto;
import com.asego.entity.Employee;
import org.springframework.stereotype.Component;

@Component

public class EmployeeMapper {
    public static final  EmployeeDto empDtoToEntity(Employee emp) {
        EmployeeDto dto = new EmployeeDto();

        dto.setName(emp.getName());
        dto.setDesignation(emp.getDesignation());
        dto.setEmployeeCode(emp.getEmployeeCode());
        dto.setMailId(emp.getMailId());
        dto.setPhoneNo(emp.getPnoneNo());
        return dto;

    }
    public static final Employee empEntityToDto(EmployeeDto dto){
        Employee emp=new Employee();

        emp.setName(dto.getName());
        emp.setEmployeeCode(dto.getEmployeeCode());
        emp.setMailId(dto.getMailId());
        emp.setDesignation(dto.getDesignation());
        emp.setPnoneNo(dto.getPhoneNo());
            return emp;
    }
}
