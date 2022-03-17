package com.hunglp.spring_boot_transaction_overview.repository;

import com.hunglp.spring_boot_transaction_overview.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
