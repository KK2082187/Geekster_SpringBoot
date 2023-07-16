package com.geekster.Instagram.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenId;
    private String token;
    private LocalDateTime tokenCreationDate;


    @OneToOne
    @JoinColumn(name="fk_user_Id")
    private User user;
    public AuthenticationToken(User user){
        this.user = user;
        this.token = UUID.randomUUID().toString();
        this.tokenCreationDate = LocalDateTime.now();
    }
}
