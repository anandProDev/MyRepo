package com.model;

import org.junit.Test;

import static com.model.GreetingModel.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class GreetingModelTest {

    public static final String TEST = "test";

    @Test
    public void builGreetingModel(){

        GreetingModel greetingModel = new GreetingModelBuilder().setId(1).setContent(TEST).build();
        assertThat(greetingModel.getId(), is(1L));
        assertThat(greetingModel.getContent(), is(TEST));
    }
}