package com.geekster.UserManagementSystem.Controller;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
     @Autowired
     UserService userService;

    @PostMapping(value="/addUser")
    public String addedUser(@RequestBody User user){
        return userService.addUser(user);
    }


    @GetMapping("getUser/{userId}")
     public User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
     }

    @GetMapping("getAllUser")
    public List<User> allUser(){
        return userService.getAllUser();
    }

    @PutMapping("updateUserInfo/{userId}/{name}")
    public String updateUserInfo(@PathVariable Integer userId,@PathVariable String name){
        return userService.updateUserInfo(userId,name);
    }
    @DeleteMapping("deleteUser/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }

}
