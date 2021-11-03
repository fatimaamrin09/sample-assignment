package com.sample.assignment.converter;

import com.sample.assignment.domain.EmployeeDTO;
import com.sample.assignment.entity.Employee;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class EmployeeResponseConvertor {

    public List<EmployeeDTO> formatGetResponse(List<Employee> employeeList) {
       return   employeeList.stream().map(employee -> {
               return getEmployeeDTO(employee);
           }
        ).collect(Collectors.toList());

    }

    public EmployeeDTO getEmployeeDTO(Employee employee) {
        return   EmployeeDTO
              .builder()
              .departmentId(employee.getDepartmentId())
              .firstName(employee.getFirstName())
              .lastName(employee.getLastName())
              .email(employee.getEmail())
              .phoneNumber(employee.getPhoneNumber())
              .salary(employee.getSalary())
              .managerId(employee.getManagerId())
              .departmentId(employee.getDepartmentId())
              .build();
    }
}
