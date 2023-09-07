package com.miniproject.eventmanagement.conrtoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.miniproject.eventmanagement.model.User;
// import com.miniproject.eventmanagement.model.Types;

import com.miniproject.eventmanagement.servies.UserServies;

@RestController
@RequestMapping("/user")
   
public class UserController {
    
    final UserServies userServies;

    @Autowired
     public UserController(UserServies userServies) {
        this.userServies = userServies;
    }
    @CrossOrigin
    @GetMapping("/register")
    public List<User> getAllUsers() {
        return userServies.getAllUsers();
    }
     @CrossOrigin
      @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
          System.out.println("prttttttttttttt" + user.getEmail()+ "testtt");
        User savedUser = userServies.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
    @CrossOrigin
    @PostMapping("/logIn")
    public ResponseEntity<?> login(@RequestBody User loginForm) {
        String name = loginForm.getName();
        String password = loginForm.getPassword();

        // Perform authentication logic here...
        // For example, check if the password matches the retrieved user password
        System.out.println("helooo.......... login"+ name + "paass:::"+ password);
        User user = userServies.getUserByname(name);
        if (user != null && user.getPassword().equals(password)) {
            // Authentication successful
            // You can return a success response or a JWT token here, depending on your implementation
            // return ResponseEntity.ok("Login successful");
            return new ResponseEntity<>(user,HttpStatus.FOUND);
        } else {
            // Authentication failed
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
        }
    }
    @CrossOrigin
    @GetMapping("ids/{user}")
    // @PathVariable Long userId
    public User getUser(@PathVariable Long user) {
        
        System.out.println("in ids");
        // Long id= Long.valueOf(user);
        // Your logic to fetch user by userId
        System.out.print(user);
        User data=userServies.getUserById(user);
        if(data!= null){
            return data;
        }else{
              return null;
        }
       
    }
    
    // public ResponseEntity<Object> getUser(@PathVariable Long userId) {
    //     User data = userServies.getUserById(userId);

    //     if (data != null) {
    //         return ResponseEntity.ok(data); // Return User object
    //     } else {
    //         String errorResponse = "User not found";
    //         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    //     }
    // }
    

}
