package com.geekster.Ecommerce.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private Long productId;

    private String productName;

    private Category productCategory;

    private String productDescription;

    private Double productPrice;

}
