package com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sendemail")
class SendResetPasswordEmailController {

    @Autowired
    SendResetPasswordEmailService emailService;

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        String value = emailService.sendEmail();
        System.out.println(value);
        return value;
    }
}