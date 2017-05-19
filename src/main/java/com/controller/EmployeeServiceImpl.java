package com.controller;


import com.controller.EmployeeService;
import com.domain.Greeting;
import com.model.GreetingModel;
import com.transformer.GreetingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class EmployeeServiceImpl implements EmployeeService {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private GreetingTransformer greetingTransformer;

    @Autowired
    public EmployeeServiceImpl(GreetingTransformer greetingTransformer) {
        this.greetingTransformer = greetingTransformer;
    }

    @RequestMapping(path="/hello",method=RequestMethod.GET)
    public @ResponseBody
    GreetingModel sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {

        return new GreetingModel(counter.incrementAndGet(), String.format(template, name));
    }
}
