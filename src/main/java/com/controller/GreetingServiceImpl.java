package com.controller;


import com.domain.Greeting;
import com.model.GreetingModel;
import com.transformer.GreetingTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingServiceImpl implements GreetingService {

    private GreetingTransformer greetingTransformer;

    @Autowired
    public GreetingServiceImpl(GreetingTransformer greetingTransformer) {
        this.greetingTransformer = greetingTransformer;
    }

    @RequestMapping(path="/hello",method=RequestMethod.GET)
    public @ResponseBody
    GreetingModel sayHello(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {

        // validate
        Greeting greeting = greetingTransformer.transform(name);

        return greetingTransformer.transform(greeting);
    }

    @Override
    @RequestMapping(path="/hello",method=RequestMethod.POST)
    public String sayHello(GreetingModel greetingModel) {
        return "hello";

    }

    @RequestMapping(path="/hello/name/{name}",method=RequestMethod.GET)
    public @ResponseBody
    GreetingModel sayHi(@PathVariable("name") String name) {

        Greeting greeting = greetingTransformer.transform(name);

        return greetingTransformer.transform(greeting);
    }
}
