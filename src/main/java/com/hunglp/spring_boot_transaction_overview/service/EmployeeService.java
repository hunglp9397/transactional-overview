package com.hunglp.spring_boot_transaction_overview.service;

import com.hunglp.spring_boot_transaction_overview.model.*;

import java.util.*;

public interface EmployeeService {

    void saveEmployee();

    List<Employee> getEmployees();

    void saveListEmployee();

}
