package config;

import controller.EmployeeServiceImpl;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class SpringMagic
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringMagic.class, args);
    }
}