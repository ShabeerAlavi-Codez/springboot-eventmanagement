package com.example.eventmanagement.eventmanagement.conrtoller;
import com.example.eventmanagement.eventmanagement.model.Person;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Person")
public class PersonController{
    //for cross origin first step
    @CrossOrigin
    @GetMapping()
    public Person get(){
        return new Person("ABC", "BCDD", 2345);
    }
    
}

