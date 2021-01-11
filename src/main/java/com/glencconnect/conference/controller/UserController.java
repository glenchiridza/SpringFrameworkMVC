package com.glencconnect.conference.controller;

import com.glencconnect.conference.model.Registration;
import com.glencconnect.conference.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by glenc on Jan 2021
 **/
@RestController
public class UserController {


    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname",defaultValue = "Glen") String firstname,
                        @RequestParam(value = "lastName",defaultValue = "Chiridza") String lastName,
                        @RequestParam(value = "age",defaultValue = "24") int age){

        User user = new User();
        user.setFirstname(firstname);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){

        System.out.println("User firstname:"+user.getFirstname());

        return user;
    }

}
