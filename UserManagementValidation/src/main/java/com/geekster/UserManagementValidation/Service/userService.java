package com.geekster.UserManagementValidation.Service;

import com.geekster.UserManagementValidation.Model.userModel;
import com.geekster.UserManagementValidation.Repository.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    userDao  dao;

    public String addUser(userModel user){
        return dao.save(user);
    }
    public List<userModel> getAll(){
        return dao.getAllUserModelList();
    }
    public userModel getUserById(String userId){
        List<userModel>list = getAll();
        for(userModel obj:list){
            if(obj.getUserId().equals(userId)){
                return obj;
            }
        }
        return null;
    }
    public String updateUser(String userId,userModel user){
        boolean status = dao.updateUserById(userId,user);
        if(status){
            return "User: " + userId + " was updated!!!";
        }else{
            return "User: " + userId + " does not exist!!!";
        }
    }
    public String removeUser(String userId){
        List<userModel>list = getAll();
        boolean status = false;
        for(userModel obj:list){
            if(obj.getUserId().equals(userId)){
                status = dao.removeUserById(obj);
                if(status){
                    return "User " + userId + " removed from database successfully!!!";
                }else{
                    return "User " + userId + " cannot removed from database!!!";
                }
            }
        }
        return "User " + userId + " does not exit!!!";
    }
}
