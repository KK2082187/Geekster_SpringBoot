package com.geekster.Instagram.Service;

import com.geekster.Instagram.Dto.SignInInput;
import com.geekster.Instagram.Dto.SignInOutput;
import com.geekster.Instagram.Dto.SignUpInput;
import com.geekster.Instagram.Dto.SignUpOutput;
import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    IUserRepo iUserRepo;
    @Autowired
    AuthenticationService authenticationService;
    @Autowired
    PostService postService;
    public SignUpOutput signUp(SignUpInput signUpDto){
        User user = iUserRepo.findByUserEmail(signUpDto.getUserEmail());
        if(user != null){
            throw new IllegalStateException("User already exists!!");
        }
        String encryptedPassword = null;
        try{
            encryptedPassword = encryptedPassword(signUpDto.getUserEmail());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        user = new User(signUpDto.getUserFirstName(),signUpDto.getUserLastName(),signUpDto.getUserAge(),signUpDto.getUserEmail(),encryptedPassword,signUpDto.getUserPhoneNumber())
        iUserRepo.save(user);
        AuthenticationToken token = new AuthenticationToken(user);
        authenticationService.saveToken(token);
        return new SignUpOutput("Registered");
    }



    private String encryptPassword(String userPassword) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(userPassword.getBytes());
        byte[] digested = md5.digest();

        String hash = DataTypeConverter.printHexBinary(digested);
        return hash;
        public SignInOutput signIn (SignInInput signInDto){


            User user = iUserRepo.findByUserEmail(signInDto.getPatientEmail());

            if (user == null) {
                throw new IllegalStateException("User invalid!!!!...sign up instead");
            }


            String encryptedPassword = null;

            try {
                encryptedPassword = encryptPassword(signInDto.getPatientPassword());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();

            }


            boolean isPasswordValid = encryptedPassword.equals(user.getPatientPassword());

            if (!isPasswordValid) {
                throw new IllegalStateException("User invalid!!!!...sign up instead");
            }


            AuthenticationService authToken = authenticationService;


            return new SignInOutput("Authentication Successfully !!!", authToken.getToken(user));
        }
    }