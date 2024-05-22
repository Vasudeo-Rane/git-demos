package org.example;

public class Test1 {
    public static void main(String[] args) {
       X x = new X();
       x.acceptConsumer(a-> System.out.println(a));


       StudentImplementation studentImplementation = new StudentImplementation();
        System.out.println(studentImplementation.concatenation(Student1 -> Student1.getFirstName()));


    }
}
