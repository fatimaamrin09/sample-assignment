package com.sample.assignment.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EMPLOYEE")
@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = Employee.FINDALL)
})
public class Employee implements Serializable {

    public static final String FINDALL = "SELECT  a FROM Employee a";

    @Id
    @SequenceGenerator(name = "EmployeeGen")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false, length = 6)
    private int employeeId;

    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 25)
    private String lastName;

    @Column(name = "email", nullable = false, length = 25)
    private String email;

    @Column(name = "phone_number", nullable = false, length = 20)
    private int phoneNumber;

    @Column(name = "salary", nullable = false, length = 8)
    private int salary;

    @Column(name = "manager_id", nullable = false, length = 6)
    private int managerId;

    @Column(name = "department_id", nullable = false, length = 4)
    private int departmentId;
}
