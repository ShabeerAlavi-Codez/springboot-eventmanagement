package com.miniproject.eventmanagement.conrtoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.eventmanagement.model.Person;
import com.miniproject.eventmanagement.servies.PersonServies;


@RestController
@RequestMapping("/alavi")
public class PersonController{
    private final PersonServies personService;
    @Autowired
    public PersonController(PersonServies personService) {
        this.personService = personService;
    }
    //for cross origin first step
    @CrossOrigin
    @GetMapping()
    public List<Person> getAllPersons() {
        System.out.println("print  alaviiiresutttttttttttttttttttttttttttttttttttttt");
        return personService.getAllPersons();
    }
    // public Person get(){
    //     return new Person("ABC", "BCDD", 2345);
    // }

      // POST method to create a new person
      @PostMapping()
      public Person createPerson(@RequestBody Person person) {
          return personService.createPerson(person);
      }
    
    
    
}

