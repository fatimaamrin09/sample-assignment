package com.sample.assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DEPARTMENT")
@Getter
@Setter
public class Department {

    @Id
    @Column(name = "department_id", nullable = false, length = 4)
    private int departmentId;

    @Column(name = "department_name", nullable = false, length = 30)
    private int departmentName;

    @Column(name = "manager_id", nullable = false, length = 6)
    private int managerId;
}
