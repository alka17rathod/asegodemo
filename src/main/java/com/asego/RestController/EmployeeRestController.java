package com.asego.RestController;

import com.asego.Exception.EmployeeException;
import com.asego.Service.EmployeeServiceI;
import com.asego.dto.EmployeeDto;
import com.asego.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    private EmployeeServiceI employeeService;

    @Autowired
    public void setEmployeeService(EmployeeServiceI employeeService) {
        this.employeeService = employeeService;
    }


    @Autowired
    public EmployeeRestController(EmployeeServiceI employeeService) {
        this.employeeService = employeeService;
    }

    private static Logger logger = LoggerFactory.getLogger(SellingPlanRestcotroller.class);

    @PostMapping("/createEmp")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto dto) {
        logger.debug("create() method execution started");
        EmployeeDto created = this.employeeService.createemployee(dto);
        logger.info("create employee() method executed successfully");

        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }


    @GetMapping("/id/{id}")
    public ResponseEntity<EmployeeDto> getSingleUser(@PathVariable Integer id) throws EmployeeException {
        EmployeeDto singleEmployee = employeeService.singleAllEmployee(id);
        return new ResponseEntity<EmployeeDto>(singleEmployee, HttpStatus.OK);

    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<EmployeeDto>> getAllEmployee() throws EmployeeException {
        List<EmployeeDto> allEmployee = employeeService.getAllEmployee();
        return new ResponseEntity <List<EmployeeDto>>(allEmployee, HttpStatus.OK);
    }
}