package com.geekster.Employee.Address.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zipcode")
    private String zipcode;
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;
}
