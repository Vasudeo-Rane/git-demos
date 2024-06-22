package com.vasu.spring_api_vasudeo.Service;

import com.vasu.spring_api_vasudeo.entities.Employee;
import com.vasu.spring_api_vasudeo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


  @Service
public class EmployeeService {

      @Autowired
      EmployeeRepo employeeRepo ;

      public List<Employee> getEmployeeRepo() {
          return employeeRepo.getAllUser();
      }

      public List<Employee> getEmployeeWithSalaryGreaterThan(Double salary) {
          return employeeRepo.getAllEmployeeSalary(salary) ;
      }

      public List<Employee> getEmployeeDetails(String name) {
          return employeeRepo.getEmployeeDetails(name);
      }
  }
