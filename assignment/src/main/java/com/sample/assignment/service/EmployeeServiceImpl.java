package com.sample.assignment.service;

import com.sample.assignment.entity.Employee;
import com.sample.assignment.repository.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Employee saveEmployeeDetails(Employee employee) throws  Exception{
       return employeeRepository.save(employee);
    }

    @Override public List<Employee> getEmployeeDetails() throws Exception {
        return employeeRepository.findAll();
    }
}
