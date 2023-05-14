package com.geekster.Instagram.Controller;

import com.geekster.Instagram.Dto.SignInInput;
import com.geekster.Instagram.Dto.SignInOutput;
import com.geekster.Instagram.Dto.SignUpInput;
import com.geekster.Instagram.Dto.SignUpOutput;
import com.geekster.Instagram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired

    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return userService.signUp(signUpDto);
    }
    @PostMapping("/signin")
    public SignInOutput signup(@RequestBody SignInInput signInDto)
    {
        return userService.signIn(signInDto);
    }

}
