package com.transformer;

import com.domain.Greeting;
import com.model.GreetingModel;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class GreetingTransformerTest {

    GreetingTransformer greetingTransformer = new GreetingTransformer();
    public static final String NAME = "test";

    @Test
    public void transformModelToDomain(){
        Greeting greeting = greetingTransformer.transform(NAME);

        assertThat(NAME, is(greeting.getContent()));
        assertThat(NAME, is(greeting.getContent()));
    }

    @Test
    public void transformDomainToModel() {

        Greeting greeting = new Greeting(1, NAME);
        GreetingModel greetingModel = greetingTransformer.transform(greeting);

        assertThat(greetingModel.getContent(), is("Hello, " + NAME + "!"));
        assertThat(greetingModel.getId(), is(1L));
    }

}