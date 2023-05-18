package com.geekster.DoctorApp.Service;

import com.geekster.DoctorApp.Dto.SignInInput;
import com.geekster.DoctorApp.Dto.SignInOutput;
import com.geekster.DoctorApp.Dto.SignUpInput;
import com.geekster.DoctorApp.Dto.SignUpOutput;
import com.geekster.DoctorApp.Model.AppointmentKey;
import com.geekster.DoctorApp.Model.AuthenticationToken;
import com.geekster.DoctorApp.Model.Doctor;
import com.geekster.DoctorApp.Model.Patient;
import com.geekster.DoctorApp.Repository.IPatientRepo;
import jakarta.xml.bind.DatatypeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    IPatientRepo iPatientRepo;
    @Autowired
    AuthenticationService tokenService;
    @Autowired
    AppointmentService appointmentService;
    @Autowired
    DoctorService doctorService;
    public SignUpOutput signUp(SignUpInput signUpDto){
        Patient patient = iPatientRepo.findFirstByPatientEmail(signUpDto.getUserEmail());
        if(patient!= null){
            throw new IllegalStateException("Patient already exist!!!....sign in instead");
        }
        String encryptedPassword = null;
        try{
            encryptedPassword = encryptedPassword(signUpDto.getUserPassword());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        patient = new Patient(signUpDto.getUserFirstName(),
                signUpDto.getUserLastName(),
                signUpDto.getUserEmail(),
                encryptedPassword,signUpDto.getUserContact());
        iPatientRepo.save(patient);
        AuthenticationToken token = new AuthenticationToken(patient);
        tokenService.saveToken(token);
        return new SignUpOutput("Patient registered","Patient created successfully");
    }
    private String encryptedPassword(String userPassword)throws NoSuchAlgorithmException{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(userPassword.getBytes());
        byte[]digested = md5.digest();
        String hash = DatatypeConverter.printHexBinary(digested);
        return hash;
    }
    public SignInOutput signIn(SignInInput signInDto){
        Patient patient = iPatientRepo.findFirstByPatientEmail(signInDto.getPatientEmail());
        if(patient==null){
            throw new IllegalStateException("User invalid!!!...sign up instead");
        }
      String encryptedPassword = null;
        try{
          encryptedPassword = encryptedPassword(signInDto.getPatientPassword());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        boolean isPasswordValid = encryptedPassword.equals(patient.getPatientPassword());
        if(!isPasswordValid){
            throw new IllegalStateException("User invalid !!!...sign up instead");
        }
        AuthenticationToken authToken = tokenService.getToken(patient);
        return new SignInOutput("Authentication Successfully!!!",authToken.getToken());
    }
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    public void cancelAppointment(AppointmentKey key){
        appointmentService.cancelAppointment(key);
    }
}
