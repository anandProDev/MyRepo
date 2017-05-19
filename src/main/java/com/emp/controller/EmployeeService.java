package com.emp.controller;

import com.domain.Greeting;
import org.springframework.web.bind.annotation.ResponseBody;

public interface EmployeeService {

    public Greeting sayHello(String name);
}
