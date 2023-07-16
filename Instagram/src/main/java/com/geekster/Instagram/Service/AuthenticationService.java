package com.geekster.Instagram.Service;

import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    IAuthenticationRepo authenticationRepo;
    public boolean authenticate(String email, String token) {
        AuthenticationToken authToken = authenticationRepo.findFirstByTokenValue(token);
        if(authToken==null){
            return false;
        }
        String tokenConnectionEmail = authToken.getUser().getEmail();
        return tokenConnectionEmail.equals(email);
    }
    public void saveAuthToken(AuthenticationToken authToken){
         authenticationRepo.save(authToken);
    }
    public AuthenticationToken findFirstByUser(User user){
        return authenticationRepo.findFirstByUser(user);
    }
    public void removeToken(AuthenticationToken token){
        authenticationRepo.delete(token);
    }
}
