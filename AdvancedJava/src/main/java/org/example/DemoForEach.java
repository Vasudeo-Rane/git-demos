package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer>
{
  public void accept(Integer i){
      System.out.println(i);
  }
}
public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4);
        Consumer<Integer> c = new ConsImpl();
        values.forEach(c);
//        values.forEach(i-> System.out.println(i));

    }
}
