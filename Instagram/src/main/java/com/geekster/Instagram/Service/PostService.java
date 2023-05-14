package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.Post;
import com.geekster.Instagram.Repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo iPostRepo;
    public void savePost(Post createPost){
        iPostRepo.save(createPost);
    }
    public List<Post> getAllPost(){
        return iPostRepo.findAll();
    }
}
