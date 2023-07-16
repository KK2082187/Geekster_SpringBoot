package com.geekster.Instagram.Controller;

import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.Post;
import com.geekster.Instagram.Service.AuthenticationService;
import com.geekster.Instagram.Service.PostService;
import com.geekster.Instagram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    UserService userService;
@Autowired
    PostService postService;
@Autowired
    AuthenticationService authenticationService;
@PostMapping("post");
public String createPost(@RequestBody Post post, @RequestParam  String email,@RequestParam String token){
    if(authenticationService.authenticate(email,token)){
        return userService.createPost(post,email,token)
    }else{
        return "Not an Authenticated user activity";
    }
}
}
