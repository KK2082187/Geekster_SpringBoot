package com.geekster.Restaurant.Management.Service.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Order {
    private Long orderId;
    private FoodItem id;
    private Long quantity;
    private User userId;
    private String status;
}
