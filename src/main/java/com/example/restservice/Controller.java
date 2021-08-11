package com.example.restservice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/response")
public class Controller {
    @PostMapping(value = "/postbody")
       
    public Employee employee(@RequestBody Employee employee){
        return employee;
    }
    
}
