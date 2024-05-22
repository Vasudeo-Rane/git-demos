package org.example;

import java.util.function.Function;

public class StudentImplementation {

        public String concatenation (Function<Student1, String> details ) {
         return details.apply(new Student1("Vasudeo", "Rane"));
         }

}

