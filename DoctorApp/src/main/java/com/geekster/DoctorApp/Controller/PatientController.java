package com.geekster.DoctorApp.Controller;

import com.geekster.DoctorApp.Dto.SignInInput;
import com.geekster.DoctorApp.Dto.SignInOutput;
import com.geekster.DoctorApp.Dto.SignUpInput;
import com.geekster.DoctorApp.Dto.SignUpOutput;
import com.geekster.DoctorApp.Model.AppointmentKey;
import com.geekster.DoctorApp.Model.Doctor;
import com.geekster.DoctorApp.Service.AuthenticationService;
import com.geekster.DoctorApp.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    AuthenticationService authService;
    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto){

        return patientService.signUp(signUpDto);
    }
    @PostMapping("/signin")
    public SignInOutput signup(@RequestBody SignInInput signInDto){
        return  patientService.signIn(signInDto);
    }
    @GetMapping("/doctors")
    public ResponseEntity<List<Doctor>>getAllDoctors(@RequestParam String userEmail,@RequestParam String token){
        HttpStatus status;
        List<Doctor>allDoctors = null;
        if(authService.authenticate(userEmail,token)){
            allDoctors = patientService.getAllDoctors();
            status = HttpStatus.OK;
        }else{
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<List<Doctor>>(allDoctors,status);
    }
    @DeleteMapping("appointment")
    ResponseEntity<Void>cancelAppointment(@RequestParam String userEmail, @RequestParam String token, @RequestBody AppointmentKey key){
        HttpStatus status;
        if(authService.authenticate(userEmail,token)){
            patientService.cancelAppointment(key);
            status = HttpStatus.OK;
        }else {
            status = HttpStatus.FORBIDDEN;
        }
        return new ResponseEntity<Void>(status);
    }
}
