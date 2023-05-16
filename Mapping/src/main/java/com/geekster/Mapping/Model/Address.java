package com.geekster.Mapping.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Address {

    private Long addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;

}
