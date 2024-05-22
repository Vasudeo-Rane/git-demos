package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6} ;
        int sum2 = Arrays.stream(array1).filter(x-> x%2==0).sum();
        System.out.println(sum2);

        List<String> list = Arrays.asList("apple","banana","mango") ;
        Stream<String> stream = list.stream();

        List<Integer> collect = Stream.iterate(0,x-> x+1).limit(100).peek(x-> System.out.print(x + " "))
                .skip(1).filter(x->x%10==0).map(x-> x+1).distinct().sorted((a,b)->(b-a)).peek(x-> System.out.println(x)).collect(Collectors.toList());
    }
}
