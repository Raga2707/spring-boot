package com.zaga.springdemohello.service;

import com.zaga.springdemohello.model.Employee;

public interface EmployeeService {
    // List<Employee> getAllEmployees();

    Employee saveEmployee(String name, String department, double salary);
}
