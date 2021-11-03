package com.sample.assignment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.assignment.converter.EmployeeRequestConverter;
import com.sample.assignment.converter.EmployeeResponseConvertor;
import com.sample.assignment.domain.EmployeeDTO;
import com.sample.assignment.entity.Employee;
import com.sample.assignment.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRequestConverter employeeRequestConverter;

    @Autowired
    private EmployeeResponseConvertor employeeResponseConvertor;


    @PostMapping(value = "/saveEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDTO requestObject) throws Exception{

        Employee employee = employeeService.saveEmployeeDetails(employeeRequestConverter.formatSaveRequest(requestObject));

        return new ResponseEntity<> (mapObjectToString(employee),HttpStatus.CREATED);
    }

    @GetMapping(value = "/getEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeDTO>> getEmployee() throws Exception{

        List<Employee> employeeList = employeeService.getEmployeeDetails();

        return new ResponseEntity<>(employeeResponseConvertor.formatGetResponse(employeeList),HttpStatus.CREATED);
    }


    @PostMapping(value = "/deleteEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<EmployeeDTO>> deleteEmployee(String id) throws Exception{

        List<Employee> employeeList = employeeService.getEmployeeDetails();

        return new ResponseEntity<>(employeeResponseConvertor.formatGetResponse(employeeList),HttpStatus.CREATED);
    }



    public String mapObjectToString(Object obj) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString  = null;
        try {
            jsonString = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new Exception( e);
        }
        return jsonString;
    }
}
