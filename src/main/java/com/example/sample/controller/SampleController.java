package com.example.sample.controller;

import com.example.sample.modal.Login;
import com.example.sample.service.ExtAPIServiceImpl;
import com.example.sample.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SampleController {

    @Autowired
    LoginServiceImpl loginServiceImpl;

    @Autowired
    ExtAPIServiceImpl extAPIServiceImpl;

    @GetMapping("/")
    public String Index() {
        return "Found you...";
    }

    @PostMapping("/addUsers")
    public String addUsers(@RequestBody ArrayList<Login> users) {
        loginServiceImpl.addUser(users);
        return "Users added.";
    }

    @DeleteMapping("/removeAllUsers")
    public String removeAllUsers() {
        loginServiceImpl.deleteAllData();
        return "Removed all data.";
    }

    @GetMapping("/findUserById/{id}")
    public Login findUserById(@PathVariable("id") long id) {
        return loginServiceImpl.findUserByID(id);
    }

    @GetMapping("/deleteUserById/{id}")
    public String deleteUserById(@PathVariable("id") long id) {
        loginServiceImpl.deleteUserById(id);
        return "user removed";
    }

    @GetMapping("/findAllUsers")
    public ArrayList<Login> findAllUsers() {
        return loginServiceImpl.findAllUser();
    }

    @GetMapping("/findUsers")
    public String findUsers() {
        return extAPIServiceImpl.findUsersByCallingExtAPI();
    }

}
