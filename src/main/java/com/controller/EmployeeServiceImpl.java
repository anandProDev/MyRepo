package com.controller;


import com.domain.Greeting;
import com.model.GreetingModel;
import com.transformer.GreetingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class EmployeeServiceImpl implements EmployeeService {

    private GreetingTransformer greetingTransformer;

    @Autowired
    public EmployeeServiceImpl(GreetingTransformer greetingTransformer) {
        this.greetingTransformer = greetingTransformer;
    }

    @RequestMapping(path="/hello",method=RequestMethod.GET)
    public @ResponseBody
    GreetingModel sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {

        // validate
        Greeting greeting = greetingTransformer.transform(name);

        return greetingTransformer.transform(greeting);
    }
}
