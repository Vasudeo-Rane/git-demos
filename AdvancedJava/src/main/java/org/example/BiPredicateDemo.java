package org.example;

import java.util.function.BiPredicate;

public class BiPredicateDemo implements BiPredicate< String, String> {
    @Override
    public boolean test(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        BiPredicate<String, String > stringComparision = new BiPredicateDemo();
         boolean test = stringComparision.test("Hello", "vasu");
        System.out.println(test);

        BiPredicate<String, String> biPredicate = (s1,s2) -> (s1.equals(s2));
        System.out.println(biPredicate.test("Naman" , "Naman"));
     }
}
