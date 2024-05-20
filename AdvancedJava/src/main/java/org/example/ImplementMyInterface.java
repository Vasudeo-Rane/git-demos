package org.example;

public class ImplementMyInterface {
    public static void main(String[] args) {
    MyInterface example = ()-> System.out.println("This is my example");
        System.out.println(example.getClass());
    }
}

