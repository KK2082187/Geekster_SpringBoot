package com.geekster.Instagram.Service;

import com.geekster.Instagram.Dto.SignInInput;
import com.geekster.Instagram.Dto.SignUpOutput;
import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.Post;
import com.geekster.Instagram.Model.User;
import com.geekster.Instagram.Repository.IUserRepo;
import com.geekster.Instagram.Service.hashingUtility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    PostService postService;
    @Autowired
    IUserRepo userRepo;
    @Autowired
    AuthenticationService authenticationService;
    public SignUpOutput signUpUser(User user) {
        boolean signUpStatus = true;
        String signUpStatusMessage = null;
        String newEmail = user.getEmail();
        if(newEmail == null){
            signUpStatusMessage = "Invalid email";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
        User existingUser = userRepo.findFirstByUserEmail(newEmail);
        if(existingUser != null){
            signUpStatusMessage = "Email already registered";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
        try{
            String encryptedPassword = PasswordEncrypter.encryptPassword(user.getPassword());
            user.setPassword(encryptedPassword);
            userRepo.save(user);
            return new SignUpOutput(signUpStatus,"User registred sucessfully");
        }
        catch (Exception e){
            signUpStatusMessage = "Internal error occured";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
    }


    public String signInUser(SignInInput signInInput) {
        String signInStatusMessage = null;
        String signInEmail = signInInput.getEmail();
        if(signInEmail==null){
            signInStatusMessage="Invalid email";
            return  signInStatusMessage;
        }
        User existingUser = userRepo.findFirstByUserEmail(signInEmail);
        if(existingUser == null){
            signInStatusMessage = "Email not registered";
            return signInStatusMessage;
        }
        try{
            String encryptedPassword = PasswordEncrypter.encryptPassword(signInInput.getPassword());
                if(existingUser.getPassword().equals(encryptedPassword));
                {
                    AuthenticationToken authToken = new AuthenticationToken(existingUser);
                    authenticationService.saveAuthToken(authToken);
                    return "Token sent to your email";
                }
                else{
                    signInStatusMessage = "Invalid credential";
                    return signInStatusMessage;
                }
            }
            catch(Exception e){
                signInStatusMessage="Internal Error";
                return signInStatusMessage;
            }
        }


    public String signOutUser(String email) {
        User user = userRepo.findFirstByUserEmail(email);
        AuthenticationToken token = authenticationService.findFirstByUser(user);
        authenticationService.removeToken(token);
        return "User signed out successfully";
    }

    public String createPost(Post post, String email, String token) {
        User postOwner = userRepo.findFirstByUserEmail(email);
        post.setPostOwner(postOwner);
        return postService.createPost(post);
    }
}
