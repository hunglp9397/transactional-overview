package com.hunglp.spring_boot_transaction_overview.controller;

import com.hunglp.spring_boot_transaction_overview.model.*;
import com.hunglp.spring_boot_transaction_overview.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getEmployees(){
        return this.employeeService.getEmployees();
    }

    @PostMapping
    public void createEmployee(){
        this.employeeService.saveEmployee();
    }
}
