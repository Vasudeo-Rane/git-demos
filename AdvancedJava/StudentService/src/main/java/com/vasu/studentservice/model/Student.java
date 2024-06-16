package com.vasu.studentservice.model    ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentId ;
    private String firstName ;
    private String lastName ;
}
