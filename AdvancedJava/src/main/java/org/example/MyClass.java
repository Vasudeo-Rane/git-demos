package org.example;

interface Parent {
    public int a = 10 ;
    default  void sayHello(){
        System.out.println("Parent Hello");
    }
}

class Child implements Parent{
    public int a = 2;
    public void sayHello(){
        System.out.println("child Hello");
    }
}
public class MyClass {
    public static void main(String[] args) {
        Parent child = new Child() ;
        child.sayHello();
        System.out.println(child.a);
    }
}
