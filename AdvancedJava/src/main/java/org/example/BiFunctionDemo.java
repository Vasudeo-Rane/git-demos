package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;

import static org.example.Parent.a;

public class BiFunctionDemo implements BiFunction<List<Integer> , List<Integer> , List<Integer>> {

    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Implementing the Function interface
        BiFunctionDemo biFunction = new BiFunctionDemo();
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Stream.of(4, 6, 7, 8, 9).collect(Collectors.toList());
        System.out.println(biFunction.apply(list1, list2)) ;

        // Anonymous implementation
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

            @Override
            public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
                return Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());

            }
        };
        System.out.println(biFunction1.apply(list1,list2));
        //Lambda Implementation

        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = ( l1, l2) -> { return Stream.of(list1, list2)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
            };

        System.out.println(biFunction2.apply(list1,list2));

        Function<List<Integer>,List<Integer>> sortedFunction = (Lists) ->Lists.stream().sorted((a,b)->(b-a)).collect(Collectors.toList());

        System.out.println(biFunction2.andThen(sortedFunction).apply(list1,list2));


    }
}
