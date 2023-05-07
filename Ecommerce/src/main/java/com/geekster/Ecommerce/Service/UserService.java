package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.User;
import com.geekster.Ecommerce.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;
    public String saveUser(User user){
        userRepo.save(user);
        return "Saved user";
    }
    public User getUserById(Integer userId){
        return userRepo.getById(userId);
    }
}
