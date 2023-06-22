package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User>myUser = new ArrayList<>();
    public String addUser(User user){
        myUser.add(user);
        return "User Added";
    }

    public List<User> getAllUser() {
        return myUser;
    }

    public User getUser(Integer userId) {
        for(User user:myUser){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        throw  new IllegalStateException("Id not found");
    }

    public String updateUserInfo( Integer userId,String name) {
        for(User user1:myUser){
            if(user1.getUserId().equals(userId)) {
                user1.setName(name);
                return "Updated";
            }
        }
        return "Not found";
    }

    public String deleteUser(Integer userId) {
        for(User user:myUser){
            if(user.getUserId().equals(userId)){
                myUser.remove(user);
                return "Deleted";
            }
        }
        return "Already deleted";
    }
}
