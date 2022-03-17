package com.hunglp.spring_boot_transaction_overview.service.impl;

import com.hunglp.spring_boot_transaction_overview.model.*;
import com.hunglp.spring_boot_transaction_overview.repository.*;
import com.hunglp.spring_boot_transaction_overview.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;


import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public void saveEmployee() {
        Employee employee = new Employee("HungLP");
        Employee employeeSaved = employeeRepository.save(employee);

        // Fail -> transactional work, not commit db
        if(employeeSaved.getId() == 3){
            int a = 1 / 0;
            System.out.println(a);
        }
    }

    @Override
    public List<Employee> getEmployees() {
       return  this.employeeRepository.findAll();
    }
}
