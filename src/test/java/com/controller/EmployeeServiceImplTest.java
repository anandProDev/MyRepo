package com.controller;

import com.domain.Greeting;
import com.model.GreetingModel;
import com.transformer.GreetingTransformer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static com.domain.Greeting.GreetingBuilder;
import static com.model.GreetingModel.GreetingModelBuilder;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class EmployeeServiceImplTest {

    public static final String NAME = "Anand";
    EmployeeService employeeService;

    @Mock private GreetingTransformer greetingTransformer;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        employeeService = new EmployeeServiceImpl(greetingTransformer);
    }

    @After
    public void tearDown() throws Exception {
        employeeService = null;
    }

    @Test
    public void when_sayHello_isInvoked_returns_a_greetingModel() throws Exception {

        Greeting greeting = new GreetingBuilder().setId(1).setContent(NAME).build();
        GreetingModel greetingModel1 = new GreetingModelBuilder().setId(1).setContent("hello," + NAME + "!").build();

        when(greetingTransformer.transform(anyString())).thenReturn(greeting);
        when(greetingTransformer.transform(greeting)).thenReturn(greetingModel1);

        GreetingModel greetingModel = employeeService.sayHello(NAME);

        assertThat(1L, is(greetingModel.getId()));
        assertThat("hello,"+ NAME + "!", is(greetingModel.getContent()));
        verify(greetingTransformer, times(1)).transform(NAME);
        verify(greetingTransformer, times(1)).transform(greeting);
    }
}