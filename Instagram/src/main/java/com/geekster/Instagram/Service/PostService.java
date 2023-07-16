package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.Post;
import com.geekster.Instagram.Repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    public String createPost(Post post) {
        post.setPostCreatedTimeStamp(LocalDateTime.now());
        postRepo.save(post);
        return "Post uploaded!!!!";
    }
}
