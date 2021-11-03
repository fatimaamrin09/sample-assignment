package com.sample.assignment.repository;

import com.sample.assignment.entity.Employee;
import java.util.List;

public interface EmployeeRepository {

    /**
     *
     * @param employeeId
     * @return
     * @throws Exception
     */
    public Employee find(String employeeId) throws Exception;

    /**
     *
     * @param employee
     * @return
     * @throws Exception
     */
    public Employee save(Employee employee) throws Exception;
    public Employee update(Employee employee) throws Exception;
    public Employee delete(Employee employee) throws Exception;

    public List<Employee> findAll() throws Exception;
}
