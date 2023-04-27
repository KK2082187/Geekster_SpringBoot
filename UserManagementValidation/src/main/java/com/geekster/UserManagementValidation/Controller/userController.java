package com.geekster.UserManagementValidation.Controller;

import com.geekster.UserManagementValidation.Model.userModel;
import com.geekster.UserManagementValidation.Service.userService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    @Autowired
    userService service;

    @PostMapping(value = "/addUser")
    public String add(@Valid @RequestBody userModel user){
        return service.addUser(user);
    }
    @GetMapping(value = "/getAllUser")
    public List<userModel> getAllUser(){
        return service.getAll();
    }
    @GetMapping(value = "/getUser/{userId}")
    public userModel getUser(@PathVariable String userId){
        return service.getUserById(userId);
    }
    @PutMapping(value="/updateUserInfo/{userId}")
    public String updateUserInfo(@PathVariable String userId,@RequestBody userModel user){
        return service.updateUser(userId,user);
    }
    @DeleteMapping(value="/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId){
        return service.removeUser(userId);
    }
}
