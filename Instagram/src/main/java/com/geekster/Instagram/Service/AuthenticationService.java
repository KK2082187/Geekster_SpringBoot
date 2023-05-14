package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    ITokenRepo iTokenRepo;

    public AuthenticationService(User user) {
        this.user = user;
    }

    public void saveToken(AuthenticationToken token){
        iTokenRepo.save(token);
    }
    public AuthenticationToken getToken(User user){
        return iTokenRepo.findByUser(user);
    }
    public boolean authenticate(String userEmail,String token){
        AuthenticationToken authenticationToken = iTokenRepo.findByToken(token);
        String expectedEmail = authenticationToken.getUser().getUserEmail();
        return expectedEmail.equals(userEmail);
    }
}
