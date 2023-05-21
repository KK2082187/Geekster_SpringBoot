package com.geekster.Expense.Tracker.Api.Dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String phoneNumber;
}
