package org.example;

import java.util.function.Consumer;

public class AcceptConsumer {
    public void acceptConsumer(Consumer<String> consumer)
    {
        consumer.accept("Hello");
    }

}
