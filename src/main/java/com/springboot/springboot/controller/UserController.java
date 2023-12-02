package com.springboot.springboot.controller;

import com.springboot.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @GetMapping("/user")
    public User user(){
        User user=new User();
        user.setId(1);
        user.setName("gokul");
        user.setEmailid("email");
        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathvariable(@PathVariable String id,@PathVariable("id2") String name){
     return "the string"+id+name;
    }

    @GetMapping("/request")
    public String requestparams(@RequestParam String name,@RequestParam(required = false) String email){
        return "your name"+ name + email;
    }



}
