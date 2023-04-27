package com.geekster.UserManagementValidation.Repository;

import com.geekster.UserManagementValidation.Model.userModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class userDao {

    List<userModel>userModelList = new ArrayList<>();
    public String save(userModel user){
        userModelList.add(user);
        return "User added successfully!!!";
    }
    public List<userModel> getAllUserModelList(){
        return userModelList;
    }
    public Boolean updateUserById(String userId,userModel user){
        for(userModel obj:userModelList){
            if(obj.getUserId().equals(userId)){
                obj.setUserName(user.getUserName());
                obj.setUserDateOfBirth(user.getUserDateOfBirth());
                obj.setUserEmail(user.getUserEmail());
                obj.setUserPhoneNumber(user.getUserPhoneNumber());
                obj.setDate(user.getDate());
                obj.setTime(user.getTime());
            }
            return true;
        }
        return false;
    }
    public Boolean removeUserById(userModel user){
        userModelList.remove(user);
        return true;
    }
}
