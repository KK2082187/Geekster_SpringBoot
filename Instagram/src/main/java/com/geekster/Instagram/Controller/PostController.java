package com.geekster.Instagram.Controller;

import com.geekster.Instagram.Model.Post;
import com.geekster.Instagram.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping(value="/addPost")
    public String savePost(Post createPost){
        postService.savePost(createPost);
        return "Save Post";
    }
    @GetMapping(value="/getPost")
    public List<Post> getPost(){
        return postService.getAllPost();
    }
}
