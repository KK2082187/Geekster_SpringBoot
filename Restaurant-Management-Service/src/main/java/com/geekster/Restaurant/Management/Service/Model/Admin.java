package com.geekster.Restaurant.Management.Service.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String adminName;
    @Pattern(regexp = "^.+@restaurantAdmin\\.com$")
    private String adminEmail;
    private String adminPassword;
    @OneToMany
    @JoinColumn(name="fk_food_item")
    private FoodItem foodItem;
}
