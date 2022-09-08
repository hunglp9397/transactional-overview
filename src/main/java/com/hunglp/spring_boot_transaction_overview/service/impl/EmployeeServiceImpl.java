package com.hunglp.spring_boot_transaction_overview.service.impl;

import com.hunglp.spring_boot_transaction_overview.model.*;
import com.hunglp.spring_boot_transaction_overview.repository.*;
import com.hunglp.spring_boot_transaction_overview.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;


import java.io.*;
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

        // Roll back rule mặc định là chỉ có [RuntimeException] và [Error] mới rollback data
//        if(employeeSaved.getId() == 3){
//            int a = 1 / 0;
//            System.out.println(a);
//        }

        // Đối với checkedException thì rollback không hoạt động
        FileReader file = null;
        try {
            file = new FileReader("C:\\test\\a.txt");

            BufferedReader fileInput = new BufferedReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepository.findAll();
    }

    @Override
    @Transactional
    public void saveListEmployee() {
        List<Employee> employees = Arrays.asList(new Employee("Hung"), new Employee("Dung"));
        this.employeeRepository.saveAll(employees);
    }


}
