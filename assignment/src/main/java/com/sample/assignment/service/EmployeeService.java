package com.sample.assignment.service;

import com.sample.assignment.entity.Employee;
import java.util.List;

public interface EmployeeService {

    public Employee saveEmployeeDetails(Employee employee) throws  Exception;

    public List<Employee> getEmployeeDetails() throws  Exception;
}
