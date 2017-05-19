package com.model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class GreetingModelTest {


    @Test
    public void constructorInjection(){

        GreetingModel greetingModel = new GreetingModel(1, "test");
        assertThat(1, is(greetingModel.getId()));
        assertThat("test", is(greetingModel.getContent()));

    }



}