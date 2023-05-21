package com.geekster.Expense.Tracker.Api.Controller;

import com.geekster.Expense.Tracker.Api.Dto.LoginDto;
import com.geekster.Expense.Tracker.Api.Dto.RegisterDto;
import com.geekster.Expense.Tracker.Api.Model.Status;
import com.geekster.Expense.Tracker.Api.Model.User;
import com.geekster.Expense.Tracker.Api.Repository.StatusRepo;
import com.geekster.Expense.Tracker.Api.Repository.UserRepo;
import com.geekster.Expense.Tracker.Api.Service.UserService;
import com.geekster.Expense.Tracker.Api.Util.CommonUtil;
import jakarta.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;
    @Autowired
    StatusRepo statusRepo;
    @PostMapping(value = "/registerUser")
    public ResponseEntity register(@RequestBody RegisterDto registerUser){
        JSONObject isValidateUser=isValidateNewUser(registerUser);

        User user=new User();
        int id ;
        if(isValidateUser.isEmpty()) {
            user=setUser(registerUser);
            id=userService.register(user);
        }
        else {
            return new ResponseEntity<>(isValidateUser.toString(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("User save with id -"+id, HttpStatus.CREATED);
    }
    private User setUser(RegisterDto registerUser) {
        JSONObject jsonObject=new JSONObject(registerUser);
        User user=new User();

        user.setUserName(jsonObject.getString("userName"));
        user.setPassword(jsonObject.getString("password"));
        user.setFirstName(jsonObject.getString("firstName"));
        user.setLastName(jsonObject.getString("lastName"));
        user.setEmail(jsonObject.getString("email"));
        user.setPhoneNumber(jsonObject.getString("phoneNumber"));
        user.setAge(jsonObject.getInt("age"));

        Timestamp createDate=new Timestamp(System.currentTimeMillis());
        user.setCreateDate(createDate);

        Status status=statusRepo.findById(1).get();
        user.setStatusId(status);

        return user;
    }
    private JSONObject isValidateNewUser(RegisterDto registerUser) {
        JSONObject json=new JSONObject(registerUser);
        JSONObject errorList=new JSONObject();

        if(json.has("userName")){
            String userName=json.getString("userName");

            if(json.has("isUpdate")){
                List<User> userList=userRepo.findByUserName(userName);
                if(!userList.isEmpty()){
                    errorList.put("userName ","This user is already exist");
                    return errorList;
                }
            }
            List<User> userList=userRepo.findByUserName(userName);
            if(!userList.isEmpty()){
                errorList.put("userName ","This user is already exist. Please try another user name.");
                return errorList;
            }
        }
        else {
            errorList.put("userName","Missing parameter");
        }
        if(json.has("password")){
            String password=json.getString("password");
            if(!CommonUtil.validPassword(password)){
                ;               errorList.put("password","please enter valid password like this : Komal@123");
            }
        }
        else {
            errorList.put("password","Missing parameter");
        }
        if (json.has("phoneNumber")){
            String phoneNumber=json.getString("phoneNumber");
            if(!CommonUtil.isValidPhoneNumber(phoneNumber)){
                errorList.put("phoneNumber","Please enter valid PhoneNumber");
            }
        }
        else {
            errorList.put("phoneNumber","Missing parameter");
        }
        if (json.has("email")){
            String email=json.getString("email");
            if(!CommonUtil.isValidEmail(email)){
                errorList.put("email","please enter valid email like this :Komal@gmail.com");
            }
        }
        else {
            errorList.put("email","Missing parameter");
        }
        if (!json.has("firstName")){
            errorList.put("firstName","Missing parameter");
        }

        return errorList;
    }
    @PostMapping(value = "/loginUser")
    private ResponseEntity<String> loginUser(@RequestBody LoginDto loginUser){
        return userService.login(loginUser);
    }
    @GetMapping(value = "/user")
    public ResponseEntity<String> getUser(@Nullable @RequestParam String userId){
        JSONArray userDetails=userService.getUser(userId);
        return new ResponseEntity<>(userDetails.toString(),HttpStatus.OK);
    }

    @PutMapping(value = "/updateUser/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable String userId, @RequestBody RegisterDto updateData){
        JSONObject isValidate=isValidateNewUser(updateData);
        User user=null;
        int id ;
        if(isValidate.isEmpty()) {
            user=setUser(updateData);
            JSONObject responseObj=userService.update(user,userId);
            if(responseObj.has("errorMessage")){
                return new ResponseEntity<>(responseObj.toString(),HttpStatus.BAD_REQUEST);
            }
            else {
                return new ResponseEntity<>("user Updated",HttpStatus.OK);
            }
        }

        return new ResponseEntity<>(isValidate.toString(),HttpStatus.OK);
    }
    @DeleteMapping(value = "/user/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable String userId){
        userService.deleteUserById(Integer.parseInt(userId));
        return new ResponseEntity<>("user deleted",HttpStatus.NO_CONTENT);
    }
}
