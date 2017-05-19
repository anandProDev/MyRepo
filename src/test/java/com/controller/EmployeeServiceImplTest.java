package com.controller;

import com.emp.controller.EmployeeService;
import com.emp.controller.EmployeeServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class EmployeeServiceImplTest {

    EmployeeService employeeService;

    @Before
    public void setUp() throws Exception {
        employeeService = new EmployeeServiceImpl();
    }

    @After
    public void tearDown() throws Exception {
        employeeService = null;
    }

//    @Test
//    public void hello() throws Exception {
//        String hello = employeeService.hello();
//        assertThat(hello, is("Hi Anand"));
//    }

}