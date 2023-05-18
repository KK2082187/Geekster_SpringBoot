package com.geekster.DoctorApp.Service;

import com.geekster.DoctorApp.Model.AuthenticationToken;
import com.geekster.DoctorApp.Model.Patient;
import com.geekster.DoctorApp.Repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    @Autowired
    ITokenRepo iTokenRepo;
    public void saveToken(AuthenticationToken token){
        iTokenRepo.save(token);
    }
    public AuthenticationToken getToken(Patient patient){
        return iTokenRepo.findByPatient(patient);
    }
    public boolean authenticate(String userEmail,String token){
        AuthenticationToken authToken = iTokenRepo.findFirstByToken(token);
        String expectedEmail = authToken.getPatient().getPatientEmail();
        return expectedEmail.equals(userEmail);
    }
}
