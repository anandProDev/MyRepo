package com.transformer;

import com.domain.Greeting;
import com.model.GreetingModel;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

import static com.domain.Greeting.*;
import static com.model.GreetingModel.*;

@Component
public class GreetingTransformer {
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";

    public Greeting transform(String name) {
        return new GreetingBuilder().setId(counter.incrementAndGet()).setContent(name).build();
    }

    public GreetingModel transform(Greeting greeting) {
        return new GreetingModelBuilder().setId(greeting.getId()).setContent(String.format(template, greeting.getContent())).build();
    }
}
