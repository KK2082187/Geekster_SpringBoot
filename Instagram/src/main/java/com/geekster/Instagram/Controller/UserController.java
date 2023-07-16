package com.geekster.Instagram.Controller;

import com.geekster.Instagram.Dto.SignInInput;
import com.geekster.Instagram.Dto.SignUpOutput;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Service.AuthenticationService;
import com.geekster.Instagram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("user/signUp")
    public SignUpOutput signUpUser(@RequestBody User user){
        return userService.signUpUser(user);
    }
    @PostMapping("user/signIn")
    public String signInUser(@RequestBody SignInInput signInInput){
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String signOutUser(String email,String token){
        if(authenticationService.authenticate(email,token)){
            return userService.signOutUser(email);
        }else{
            return "Sign out not allowed for non authenticate user";
        }
    }
}
