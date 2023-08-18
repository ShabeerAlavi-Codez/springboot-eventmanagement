package com.miniproject.eventmanagement.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.eventmanagement.model.*;
import java.util.*;
import com.miniproject.eventmanagement.repository.*;

@Service

public class PersonServies {
    private final PersonRepository personRepository;
    @Autowired
    public PersonServies(PersonRepository personRepository){
        this.personRepository=personRepository;
    }
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }
    public Person createPerson(Person person) {
        // Add any business logic or validation here before saving the person.
        return personRepository.save(person);
    }
}
