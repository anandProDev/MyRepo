package com.controller;

import com.model.GreetingModel;
import com.transformer.GreetingTransformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.times;

public class EmployeeServiceImplTest {

    public static final String NAME = "Anand";
    EmployeeService employeeService;
    private GreetingTransformer greetingTransformer;

    @Before
    public void setUp() throws Exception {
        employeeService = new EmployeeServiceImpl(greetingTransformer);
    }

    @After
    public void tearDown() throws Exception {
        employeeService = null;
    }

    @Test
    public void sayHello() throws Exception {

        GreetingModel greeting = employeeService.sayHello(NAME);

        //assertThat(greetingTransformer.transform(), times(1));
        assertThat(1L, is(greeting.getId()));
        assertThat("Hello, Anand!", is(greeting.getContent()));
    }


}