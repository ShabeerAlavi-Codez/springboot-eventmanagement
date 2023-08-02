package com.example.eventmanagement.eventmanagement.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagement.eventmanagement.repository.PersonRepository;

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
    
}
