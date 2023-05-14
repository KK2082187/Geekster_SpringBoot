package com.geekster.Instagram.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    private String userFirstName;
    private String userLastName;
    private Integer userAge;
    private String userEmail;
    private String userPhoneNumber;

    public User(String userEmail, String userLastName, Integer userAge, String userEmail, String encryptedPassword, String userPhoneNumber) {
        this.userEmail = userEmail;
        this
    }
}
