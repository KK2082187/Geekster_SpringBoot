package com.geekster.Restaurant.Management.Service.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Food")
public class FoodItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
    @Column(name="food_name")
    private String foodName;
    @Column(name="food_price")
    private Double foodPrice;

    @Column(name="food_description")
    private String foodDescription;



}
