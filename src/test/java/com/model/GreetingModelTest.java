package com.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class GreetingModelTest {


    @Test
    public void constructorInjection(){

        GreetingModel greetingModel = new GreetingModel(1, "test");
        assertThat(greetingModel.getId(), is(1L));
        assertThat(greetingModel.getContent(), is("test"));

    }



}