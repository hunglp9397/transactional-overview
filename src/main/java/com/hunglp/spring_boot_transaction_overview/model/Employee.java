package com.hunglp.spring_boot_transaction_overview.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empName;

    public Employee(String empName) {
        this.empName = empName;
    }
}
