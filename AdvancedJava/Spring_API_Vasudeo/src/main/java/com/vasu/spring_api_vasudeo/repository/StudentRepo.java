package com.vasu.spring_api_vasudeo.repository;

import com.vasu.spring_api_vasudeo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
          Optional<Student> findByFirstName(String firstName);


}

