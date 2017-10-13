package com.controller;

import com.model.GreetingModel;

public interface GreetingService {

    GreetingModel sayHello(String name);

    String sayHello(GreetingModel greetingModel);
}
