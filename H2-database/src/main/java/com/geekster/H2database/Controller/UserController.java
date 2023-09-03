package com.geekster.H2database.Controller;

import com.geekster.H2database.Model.Users;
import com.geekster.H2database.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value="/users")
    public Iterable<Users>getUsers(){
        return  userService.getAllUsers();
    }
    @GetMapping(value="users/{name}")
    public List<Users>getUsersByName(@PathVariable String name){
        return userService.fetchUsersBYName(name);
    }
    @GetMapping(value = "users/age/{age}")
    public List<Users>getUsersByAgeFactor(@PathVariable String age){
        return userService.fetchUsersByAgeFactor(age);
    }
    @GetMapping(value = "users/{name}/greaterThan/{age}")
    public List<Users> getUsersByNameOrAgeAbove(@PathVariable String name,@PathVariable String age)
    {
        return userService.getUsersByNameOrAgeAbove(name,age);
    }

    @GetMapping(value = "users/ageGreater/combined")
    public List<Users> getUsersByNameAndAgeAbove(@RequestParam String name,@RequestParam String age)
    {
        return userService.getUsersByNameAndAgeAbove(name,age);
    }

    @GetMapping(value = "/userSort")
    public List<Users> getOrderedUsers()
    {
        return userService.getAllUsersSorted();
    }
    @PostMapping(value="/users")
    public String insertUsers(@RequestBody List<Users> usersList){
        return userService.addUsers(usersList);
    }

    @DeleteMapping(value="/user/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userService.removeUserById(id);
    }
}
