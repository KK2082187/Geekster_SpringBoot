package com.geekster.Restaurant.Management.Service.Service;

import com.geekster.Restaurant.Management.Service.Model.Authentication;
import com.geekster.Restaurant.Management.Service.Repository.IAuthenticationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    IAuthenticationRepo authenticationRepo;

    public boolean authenticate(String email, String token) {
        Authentication authentication = authenticationRepo.findFirstByToken(token);
        if (authentication==null){
            return false;
        }
        String tokenConnectedEmail = authentication.getUser().getUserEmail();
        return tokenConnectedEmail.equals(email);
    }
    public void saveAuthToken(Authentication authentication){
        authenticationRepo.save(authentication);
    }
    public void removeToken(Authentication token){
        authenticationRepo.delete(token);
    }
}
