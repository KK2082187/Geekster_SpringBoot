package com.geekster.Restaurant.Management.Service.Service;

import com.geekster.Restaurant.Management.Service.Dto.SignInInput;
import com.geekster.Restaurant.Management.Service.Dto.SignUpOutput;
import com.geekster.Restaurant.Management.Service.Model.Authentication;
import com.geekster.Restaurant.Management.Service.Model.User;
import com.geekster.Restaurant.Management.Service.Repository.IUserRepo;
import com.geekster.Restaurant.Management.Service.Service.hashingUtility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    IUserRepo userRepo;
@Autowired
AuthenticationService authenticationService;
    public SignUpOutput signUpUser(User user) {
        boolean signUpStatus = true;
        String signUpStatusMessage = null;
        String newEmail = user.getUserEmail();
        if(newEmail==null){
            signUpStatusMessage = "Invalid email";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
        User existingUser = userRepo.findFirstByUserEmail(newEmail);
        if(existingUser != null){
            signUpStatusMessage="Email already registered";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
        try{
            String encryptedPassword = PasswordEncrypter.encryptPassword(user.getUserPassword());
            user.setUserPassword(encryptedPassword);
            userRepo.save(user);
            return new SignUpOutput(signUpStatus,"User registered successfully")
        }
        catch (Exception e){
            signUpStatusMessage = "Internal error occurred during sign up";
            signUpStatus = false;
            return new SignUpOutput(signUpStatus,signUpStatusMessage);
        }
    }

    public String signInUser(SignInInput signInInput) {
    String signInStatusMessage = null;
    String signInEmail = signInInput.getEmail();
    if(signInEmail==null){
        signInStatusMessage = "Invalid email";
        return signInStatusMessage;
    }
    User existing = userRepo.findFirstByUserEmail(signInEmail)
            if(existing==null){
                signInStatusMessage="Email not registered !!";
                return signInStatusMessage;
            }
        try {
            String encryptedPassword = PasswordEncrypter.encryptPassword(signInInput.getPassword());
            if(existing.getUserPassword().equals(encryptedPassword))
            {

                Authentication authToken  = new AuthenticationT(existing);
                authenticationService.saveAuthToken(authToken);

                EmailHandler.sendEmail(signInEmail,"email testing",authToken.getTokenValue());
                return "Token sent to your email";
            }
            else {
                signInStatusMessage = "Invalid credentials!!!";
                return signInStatusMessage;
            }
        }
        catch(Exception e)
        {
            signInStatusMessage = "Internal error occurred during sign in";
            return signInStatusMessage;
        }


        public String signOutUser(String email) {
    }
}
