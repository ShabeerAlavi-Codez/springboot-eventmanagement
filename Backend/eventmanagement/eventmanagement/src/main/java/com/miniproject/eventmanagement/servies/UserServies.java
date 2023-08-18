package com.miniproject.eventmanagement.servies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.miniproject.eventmanagement.model.*;
import java.util.*;
import com.miniproject.eventmanagement.repository.*;

@Service

public class UserServies {
    private final UserRepository userRepository;
    @Autowired
    public UserServies(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User createUser(User user) {
        // Add any business logic or validation here before saving the user.
        return userRepository.save(user);
    }
    
    /////staty

    public User getUserByname(String name) {
        return userRepository.findByname(name);
    }


    ////end

}
