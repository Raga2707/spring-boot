package com.zaga.springdemohello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.springdemohello.model.Employee;
import com.zaga.springdemohello.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService empService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/createEmployee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        System.out.println("EMployee" + employee);
        Employee savedEmployee = empService.saveEmployee(employee);
        System.out.println("After Persist" + savedEmployee);
        return ResponseEntity.ok(savedEmployee);
    }

    // @GetMapping("/getAllEmp")
    // public List<Employee> getAllEmployeeDetails() {
    //     return empService.getAllEmployees();
    // }

}
