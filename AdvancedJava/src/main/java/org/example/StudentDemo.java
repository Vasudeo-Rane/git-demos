package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDemo {

    public static void main(String[] args) {
        Student s1= new Student("1","Vasu","98494","vasu.rane@gmail.com");
        Student s2= new Student("1","Vasu","98494","vasu.rane@gmail.com");
        Student s3= new Student("2","Shilpa","7654","shilpa.rane@gmail.com");
        Student s4= new Student("3","Parul","12394","parul@gmail.com");
        Student s5= new Student("4","Nitin","6494","nitine@gmail.com");

        Map<Student,Integer> m1  = new HashMap<>();
        m1.put(s1,70) ;
        m1.put(s2,50) ;
        m1.put(s3,83) ;
        m1.put(s4,99) ;
        m1.put(s5,100) ;
        /*System.out.println(m1);*/
        System.out.println(s1.equals(s2));
        Map<Student,Integer> m2  = new HashMap<>();
        m2.putAll(m1);
        m2.putIfAbsent(s5,55) ;
      /*  System.out.println(m2);*/


        System.out.println(m1.size());
        Set<Map.Entry<Student, Integer>> entries1 = m1.entrySet();

        for (Map.Entry<Student, Integer> studentIntegerEntry : entries1) {
            System.out.println(studentIntegerEntry);
        }

//read concurrent HashMap and Hash Tables
    /*   Map<Integer,Student> m3  = new HashMap<>();
     m3.put(Integer.valueOf(s1.getId(),s1);*/
        List<Student> studentList = Stream.of(s1,s2,s3,s4,s5).collect(Collectors.toList());
         List<Student> studentFilterByPhoneNo = studentList.stream().filter(student -> student.getPhoneNumber().equals("7654")).collect(Collectors.toList());
        System.out.println("Filter Student " + studentFilterByPhoneNo);

        System.out.println(studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()));
        studentList.stream().sorted(Comparator.comparing(Student::getName,Comparator.reverseOrder())).collect(Collectors.toList());
    }
}
