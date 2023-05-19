package com.geekster.Instagram.Design.Service;

import com.geekster.Instagram.Design.Model.InstagramFollower;
import com.geekster.Instagram.Design.Model.User;
import com.geekster.Instagram.Design.Repo.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowerService {
    @Autowired
    IFollowerRepo followerRepo;

    public void saveFollower(User myUser, User otherUser) {


        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);

        followerRepo.save(follower);
    }
}
