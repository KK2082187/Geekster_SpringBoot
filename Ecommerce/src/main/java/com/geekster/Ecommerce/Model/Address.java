package com.geekster.Ecommerce.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "address")
    private String address;
    @Column(name = "landmark")
    private String landmark;
    @Column(name = "zipCode")
    private String zipCode;
    @Column(name = "state")
    private String state;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User userId;
}
