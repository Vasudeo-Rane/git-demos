package org.example;

@FunctionalInterface
public interface MyInterface {
    public void myFunction();

    default void happy(){

    };

    public static void returnValue(){

    };
}
