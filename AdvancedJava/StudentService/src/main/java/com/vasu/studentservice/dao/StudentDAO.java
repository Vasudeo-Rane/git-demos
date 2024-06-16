package com.vasu.studentservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.vasu.studentservice.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAllStudents() {
        String sql = "select * from STUDENT";



        RowMapper<Student> studentRowMapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setStudentId(rs.getInt("STUDENTID"));
                student.setFirstName(rs.getString("FIRSTNAME"));
                student.setLastName(rs.getString("LASTNAME"));
                return student;
            }
        };
        List<Student> students = jdbcTemplate.query(sql,studentRowMapper);
        return students;
    }

}
