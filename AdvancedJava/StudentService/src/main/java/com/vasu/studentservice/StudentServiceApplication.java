package com.vasu.studentservice;

import com.vasu.studentservice.dao.StudentDAO;
import com.vasu.studentservice.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class StudentServiceApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(StudentServiceApplication.class, args);
//        StudentDAO studentDAO= applicationContext.getBean(StudentDAO.class);
//        List<Student> allStudents = studentDAO.getAllStudents();
//        allStudents.forEach(System.out::println);



    }


}
