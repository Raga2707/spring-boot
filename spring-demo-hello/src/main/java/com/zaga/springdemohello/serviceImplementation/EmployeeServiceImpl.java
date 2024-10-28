package com.zaga.springdemohello.serviceImplementation;

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
    public Employee saveEmployee(String name, String department, double salary) {
        Employee emp = new Employee();
        emp.setName(name);
        emp.setDepartment(department);
        emp.setSalary(salary);
        System.out.println(emp.getName() + "EMP NAME");
        System.out.println(emp + "Employee Result");
        // return empRepo.save(emp);
        empRepo.save(emp);
        return emp;

    }

    // @Override
    // public List<Employee> getAllEmployees() {
    //     // return empRepo.findAll();
    //     return employees;
    // }

}
