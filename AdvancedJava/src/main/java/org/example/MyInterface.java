package org.example;

@FunctionalInterface
public interface MyInterface {
    public String myFunction();

    default void happy(){

    };

    public static void returnValue(){

    };
}
