package com.geekster.Instagram.Design.Service;

import com.geekster.Instagram.Design.Model.InstagramFollowing;
import com.geekster.Instagram.Design.Model.User;
import com.geekster.Instagram.Design.Repo.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {
    @Autowired
    IFollowingRepo followingRepo;

    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}
