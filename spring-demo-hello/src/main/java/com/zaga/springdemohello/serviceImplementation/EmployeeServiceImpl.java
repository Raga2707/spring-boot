package com.zaga.springdemohello.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaga.springdemohello.model.Employee;
import com.zaga.springdemohello.repository.EmployeeRepository;
import com.zaga.springdemohello.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeRepository empRepo;

    // private static List<Employee> employees = new ArrayList<>();
    // static {
    //     employees.add(new Employee(1, "Alice", "IT", 200000.00));
    // }

    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepo.save(employee);
    }

    // @Override
    // public List<Employee> getAllEmployees() {
    //     // return empRepo.findAll();
    //     return employees;
    // }

}
