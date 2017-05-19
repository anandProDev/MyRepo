package config;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class SpringMagic
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringMagic.class, args);
    }
}