package controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    @RequestMapping(method=RequestMethod.GET)
    public String hello() {
        return "Hi Anand";
    }
}
