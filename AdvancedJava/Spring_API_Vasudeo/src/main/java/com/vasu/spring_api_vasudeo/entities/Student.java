package com.vasu.spring_api_vasudeo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
   @Id
    private long studentId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    }

