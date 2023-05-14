package com.geekster.Instagram.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpOutput {
     String status;
     String registered;

    public SignUpOutput(String registered) {
        this.registered = registered;
    }
}
