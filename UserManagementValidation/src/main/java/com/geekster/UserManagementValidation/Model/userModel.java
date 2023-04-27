package com.geekster.UserManagementValidation.Model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class userModel {
    @NotBlank
    private String userId;
    @NotEmpty(message="user name is mandatory")
    private String userName;
    @NotNull
    private String userDateOfBirth;
    @Email
    private String userEmail;
    @Size(min=10,max=12)
    @Pattern(regexp = "^[0-9]+$")
    private String userPhoneNumber;
    @NotNull(message = "date must be filled")
    private String Date;
    @NotNull
    private String Time;
}
