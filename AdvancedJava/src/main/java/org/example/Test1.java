package org.example;

import java.util.function.*;


public class Test1 {
    public static void main(String[] args) {
       AcceptConsumer acceptConsumer = new AcceptConsumer();
       acceptConsumer.acceptConsumer(a-> System.out.println(a));

       StudentImplementation studentImplementation = new StudentImplementation();
       System.out.println(studentImplementation.concatenation(Student1 -> Student1.getFirstName()));


       Consumer<String> consumer = s -> System.out.println(s) ;
       consumer.accept("Hello");


        Predicate<String> predicate = s -> s.length() > 5;
        boolean heelo = predicate.test("Heelo");
        System.out.println(heelo);

        Function<String, Integer > checklength =  s -> s.length() ;
        Integer hello = checklength.apply("Hello");
        System.out.println(hello);


    }
}
