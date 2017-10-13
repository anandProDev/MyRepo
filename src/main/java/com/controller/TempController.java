package com.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @Value("${myFlag.enabled}")
    String enabledFlag;

    @RequestMapping(path="/test")
    public String getSomething(){
        return enabledFlag;
    }
}
