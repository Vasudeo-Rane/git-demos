package com.vasu.spring_api_vasudeo.api;

import com.vasu.spring_api_vasudeo.Service.EmployeeService;
import com.vasu.spring_api_vasudeo.entities.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class EmployeeAPI {

    private final EmployeeService employeeService;

    public EmployeeAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/GetEmployeeDetails")
    public List<Employee> getEmployeeDetails(String name) {
        return employeeService.getEmployeeDetails(name);
    }
}
