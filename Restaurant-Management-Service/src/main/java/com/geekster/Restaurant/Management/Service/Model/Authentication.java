package com.geekster.Restaurant.Management.Service.Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Authentication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String tokenValue;
    private LocalDate tokenCreationDate;
    @OneToOne
    @JoinColumn(name="fk_user_ID")
    private User user;
    public Authentication(User user){
        this.user = user;
        this.tokenValue = UUID.randomUUID().toString();
        this.tokenCreationDate = LocalDate.now();
    }
}
