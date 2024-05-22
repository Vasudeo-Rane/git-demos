package org.example;

import java.util.function.Consumer;

public class X {
    public void acceptConsumer(Consumer<String> consumer)
    {
        consumer.accept("Hello");
    }

}
