package com.transformer;

import com.domain.Greeting;
import com.model.GreetingModel;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class GreetingTransformer {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    public Greeting transform(String name) {
        return new Greeting(counter.incrementAndGet(), name);
    }

    public GreetingModel transform(Greeting greeting) {
        return new GreetingModel(greeting.getId(), String.format(template, greeting.getContent()));
    }
}
