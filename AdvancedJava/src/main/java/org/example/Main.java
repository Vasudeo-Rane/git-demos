package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Map <String, Integer > map1 = new HashMap<>() ;
        map1.put("vasu",2313) ;    //ArrayList of LinkList ?
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> entry : entries ) {
            System.out.println(entry);
        }
    }
}