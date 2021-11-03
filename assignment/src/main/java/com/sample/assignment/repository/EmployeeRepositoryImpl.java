package com.sample.assignment.repository;

import com.sample.assignment.entity.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {


    @Autowired
    private EntityManager entityManager;

    @Override
    public Employee find(String employeeId) throws Exception {
        return null;
    }

    @Override
    public Employee save(Employee employee) throws Exception {

        entityManager.persist(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) throws Exception {
        return null;
    }

    @Override
    public Employee delete(Employee employee) throws Exception {
        return null;
    }

    @Override public List<Employee> findAll() throws Exception {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findAll",Employee.class);
        return query.getResultList();
    }
}
