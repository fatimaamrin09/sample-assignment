package com.sample.assignment.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
public class EmployeeDTO {


    private int employeeId;


    private String firstName;


    private String lastName;


    private String email;


    private int phoneNumber;


    private int salary;


    private int managerId;


    private int departmentId;
}
