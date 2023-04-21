package com.geekster.UserManagementSystem.Service;

import com.geekster.UserManagementSystem.Model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserService {
static Map<Integer, User> userData = new HashMap<Integer,User>();
public String addUser(User user){
    userData.put(user.getUserId(),user);

    return "Saved user name:"+ userData.get(user.getUserId()).getUserName();
}
public List<User> getUser(Integer userId){
    List<User>userList = new ArrayList<>();
    if(null != userId){
        if(userData.containsKey(userId)){
            userList.add(userData.get(userId));
        }
    }
    return userList;
}
public String updateUser(User newUser,Integer userId){
    if(userData.containsKey(userId)){
        userData.put(userId,newUser);
        return "User data updated";
    }else{
        return "User data not found";
    }
}
public String deleteUser(int userId){
    if(userData.containsKey(userId)){
        userData.remove(userId);
        return "User deleted with user Id"+ userId;
    }else{
        return "User not found";
    }
}
public Map<Integer,User>getAllUser(){
    return userData;
}

}
