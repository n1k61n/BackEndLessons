package com.example.test.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee) {
        if(employee.getId() != null){
            throw new IllegalArgumentException("Id must be empty");
        }
        if(employeeRepository.findByEmail(employee.getEmail())
                .isPresent()){
            throw new IllegalArgumentException("Email already taken");
        }
        if(employee.getSalary() <= 5000){
            throw new IllegalArgumentException("Salary must be beger than 5000");
        }
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        if(employeeRepository.findById(id).isEmpty()){
            throw new IllegalArgumentException("Employee not found by id=%s".formatted(id));
        }
        employeeRepository.deleteAllById(Collections.singleton(id));
    }
}
