package com.vasu.spring_api_vasudeo.api;

import com.vasu.spring_api_vasudeo.Service.StudentService;
import com.vasu.spring_api_vasudeo.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentAPI {

    private final StudentService studentService;


    public StudentAPI(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String helloWorldMethod(){
        return "Hello World";
    }


    @GetMapping("/Bye")
    public String Bye(){
        return "Bye";
    }

    @GetMapping("/GetAllStudentByPage")
      List<Student> getAllStudentByPage(
              @RequestParam(value = "pageNo" , defaultValue = "0", required = false ) int pageNo,
              @RequestParam(value = "pageSize" , defaultValue = "10", required = false ) int pageSize
    ){
        return studentService.getAllStudentByPage(pageNo,pageSize) ;
      }

    @PostMapping("/AddStudent")
    public void addMoreStudent(Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("/DeleteStudent/{Id}")
    public void deleteStudent(@PathVariable("Id") Long studentId) {
        studentService.deleteStudentbyId(studentId);
    }

   }