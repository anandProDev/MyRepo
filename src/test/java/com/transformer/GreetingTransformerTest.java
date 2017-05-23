package com.transformer;

import com.domain.Greeting;
import com.model.GreetingModel;
import org.junit.Test;

import static com.domain.Greeting.GreetingBuilder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

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

        Greeting greeting = new GreetingBuilder().setId(1).setContent(NAME).build();
        GreetingModel greetingModel = greetingTransformer.transform(greeting);

        assertThat(greetingModel.getContent(), is("Hello, " + NAME + "!"));
        assertThat(greetingModel.getId(), is(1L));
    }

}