package com.sample.assignment.converter;

import com.sample.assignment.domain.EmployeeDTO;
import com.sample.assignment.entity.Employee;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRequestConverter {

    public Employee formatSaveRequest(EmployeeDTO employeeDTO) {

        return Employee
            .builder()
            .departmentId(employeeDTO.getDepartmentId())
            .firstName(employeeDTO.getFirstName())
            .lastName(employeeDTO.getLastName())
            .email(employeeDTO.getEmail())
            .phoneNumber(employeeDTO.getPhoneNumber())
            .salary(employeeDTO.getSalary())
            .managerId(employeeDTO.getManagerId())
            .departmentId(employeeDTO.getDepartmentId())
            .build();

    }
}
