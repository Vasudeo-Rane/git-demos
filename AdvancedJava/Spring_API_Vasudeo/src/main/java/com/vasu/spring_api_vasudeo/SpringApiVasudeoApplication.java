package com.vasu.spring_api_vasudeo;

import com.vasu.spring_api_vasudeo.Service.EmployeeService;
import com.vasu.spring_api_vasudeo.Service.StudentService;
import com.vasu.spring_api_vasudeo.entities.Employee;
import com.vasu.spring_api_vasudeo.entities.Student;
import com.vasu.spring_api_vasudeo.repository.StudentRepo;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication

public class SpringApiVasudeoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringApiVasudeoApplication.class, args);
        StudentService studentService = applicationContext.getBean(StudentService.class);
        Student student1 = new Student(12L,"onkar","choudari","1475434523");
        studentService.addStudent(student1);

        studentService.addStudent(Student.builder().studentId(13L).firstName("Vasu").lastName("Rane").phoneNumber("123456789").build());
        studentService.addStudent(Student.builder().studentId(14L).firstName("Naman").lastName("Ojha").phoneNumber("674342342").build());
        studentService.addStudent(Student.builder().studentId(15L).firstName("Nupur").lastName("Gupta").phoneNumber("9876543221").build());
        List<Student> allStudent = studentService.getAllStudent();
        System.out.println("All Student " + allStudent);
        Optional<Student> studentById = studentService.getStudentById(3L);
        System.out.println("Student 3rd " + studentById);

        Optional<Student> vasu = studentService.searchStudentByFirstName("Vasu");
        System.out.println(vasu);

        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);


        List<Employee> employeeRepo = employeeService.getEmployeeRepo();

        List<Employee> employeeWithSalaryGreaterThan = employeeService.getEmployeeWithSalaryGreaterThan(200.00);

        employeeRepo.forEach(System.out::println);
        System.out.println("-------------------------------------------");
        employeeWithSalaryGreaterThan.forEach(System.out::println);
    }
}
