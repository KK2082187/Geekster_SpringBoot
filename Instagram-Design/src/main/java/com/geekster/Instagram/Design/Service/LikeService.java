package com.geekster.Instagram.Design.Service;

import com.geekster.Instagram.Design.Model.PostLike;
import com.geekster.Instagram.Design.Repo.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    ILikeRepo likeRepo;

    public void like(PostLike postLike) {
        likeRepo.save(postLike);
    }

    public long getLikes(Long postId) {

        return likeRepo.countByPost_PostId(postId);
    }
}
