package com.geekster.H2database.Service;

import com.geekster.H2database.Model.Users;
import com.geekster.H2database.Repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    IUserRepository userRepository;

    public Iterable<Users>getAllUsers(){
        Iterable<Users>allUsers = userRepository.findAll();
        return allUsers;
    }
    public List<Users>getAllUsersSorted(){
       return userRepository.findUsersOrderedByAgeASC();
    }
    public String addUsers(List<Users>usersList){
        Iterable<Users>addedUsers = userRepository.saveAll(usersList);
        if(addedUsers != null)
            return "Yes";
        else
            return "No";
    }

    public void removeUserById(Integer id){
        userRepository.deleteById(id);
    }
    public List<Users>fetchUsersBYName(String name){
        return userRepository.findByName(name);
    }
    public List<Users>fetchUsersByAgeFactor(String age){
        Integer userAge = Integer.parseInt(age);
        return userRepository.findByAgeGreaterThan(userAge);
    }
    public List<Users> getUsersByNameOrAgeAbove(String name, String age) {

        Integer userAge = Integer.parseInt(age);
        return userRepository.findByNameOrAgeGreaterThan(name,userAge);
    }

    public List<Users> getUsersByNameAndAgeAbove(String name, String age) {

        Integer userAge = Integer.parseInt(age);
        return userRepository.findByNameAndAgeGreaterThan(name,userAge);
    }
}
