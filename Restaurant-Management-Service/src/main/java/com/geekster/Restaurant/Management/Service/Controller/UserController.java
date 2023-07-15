package com.geekster.Restaurant.Management.Service.Controller;

import com.geekster.Restaurant.Management.Service.Dto.SignInInput;
import com.geekster.Restaurant.Management.Service.Dto.SignUpOutput;
import com.geekster.Restaurant.Management.Service.Model.User;
import com.geekster.Restaurant.Management.Service.Service.AuthenticationService;
import com.geekster.Restaurant.Management.Service.Service.UserService;
import jakarta.validation.Valid;
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

@PostMapping("user/signup")
    public SignUpOutput signUpRestUser(@RequestBody User user){
    return userService.signUpUser(user);
}
@PostMapping("user/signIn")
    public String signInRestUser(@RequestBody @Valid SignInInput signInInput){
    return userService.signInUser(signInInput);
}
@DeleteMapping("user/signOut")
    public String signOutRestUser(String email,String token){
    if(authenticationService.authenticate(email,token)){
        return userService.signOutUser(email);
    }else{
        return "Sign out not allowed for non authenticate user";
    }
}
}
