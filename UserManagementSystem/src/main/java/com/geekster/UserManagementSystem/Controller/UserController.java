package com.geekster.UserManagementSystem.Controller;

import com.geekster.UserManagementSystem.Model.User;
import com.geekster.UserManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        String userAdded = userService.addUser(user);
        return userAdded;
    }
    @GetMapping("/getUser/{userId}")
    public  String getUser(@PathVariable String userId){
        return userService.getUser(Integer.valueOf(userId)).toString();
    }
    @GetMapping("/getAllUser")
    public Map<Integer,User> getAllUser(){
        return userService.getAllUser();
    }
    @PutMapping("/updateUserInfo/{userId}")
    public String updateUserInfo(@RequestBody User user,@PathVariable String userId){
        return userService.updateUser(user,Integer.valueOf(userId));
    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId){
        return userService.deleteUser(Integer.parseInt(userId));
    }
}
