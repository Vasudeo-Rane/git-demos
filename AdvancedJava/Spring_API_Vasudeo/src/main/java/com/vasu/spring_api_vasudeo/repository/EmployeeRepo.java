package com.vasu.spring_api_vasudeo.repository;

import com.vasu.spring_api_vasudeo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query(value = "Select * from Employee " , nativeQuery = true)
    List<Employee> getAllUser();

    @Query(value="Select u from Employee u where u.employeeSalary > ?1 ")
    List<Employee> getAllEmployeeSalary(Double salary);

    @Query("Select u from Employee u where u.employeeId = :n")
    List<Employee> getEmployeeDetails(@Param("n") String name);

}

