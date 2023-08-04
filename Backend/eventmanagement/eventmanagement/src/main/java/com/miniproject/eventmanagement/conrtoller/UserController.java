package com.miniproject.eventmanagement.conrtoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.eventmanagement.model.Person;
import com.miniproject.eventmanagement.model.User;
import com.miniproject.eventmanagement.servies.PersonServies;
import com.miniproject.eventmanagement.servies.UserServies;

@RestController
@RequestMapping("/user")

public class UserController {
    final UserServies userServies;
    @Autowired
    public UserController(UserServies UserServies){
        this.userServies=UserServies;
    }
    @CrossOrigin
    @GetMapping("/register")
    public List<User> getAllUsers() {
        System.out.println("*********************get******************************");
        return userServies.getAllUsers();
    }
     @CrossOrigin
      @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
          System.out.println("prttttttttttttt" + user.getEmail()+ "testtt");
        User savedUser = userServies.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    // @PostMapping(path = "/register",   consumes = "application/json", produces = "application/json")
    //   public User createUser(@RequestBody User user) {
    //     System.out.println("prttttttttttttt" + user.getEmail()+ "testtt");
    //       return userServies.createUser(user);
    //   }

}
