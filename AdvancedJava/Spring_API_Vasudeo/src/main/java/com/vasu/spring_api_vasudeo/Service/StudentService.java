package com.vasu.spring_api_vasudeo.Service;

import com.vasu.spring_api_vasudeo.entities.Student;
import com.vasu.spring_api_vasudeo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired

    StudentRepo studentRepo ;
    public void addStudent(Student student) {

        studentRepo.save(student);
    }

    public List<Student> getAllStudent(){

        return studentRepo.findAll();
    }


    public List<Student> getAllStudentByPage(int pageNo , int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
        Page<Student> studentDetails = studentRepo.findAll(pageable);
        List<Student> allStudent = studentDetails.getContent();
        return allStudent;
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepo.findById(id);
    }

    public Optional<Student> searchStudentByFirstName(String firstName) {
        return studentRepo.findByFirstName(firstName);
    }

    public void  deleteStudentbyId(Long studentId) {
        studentRepo.deleteById(studentId);
    }

}
