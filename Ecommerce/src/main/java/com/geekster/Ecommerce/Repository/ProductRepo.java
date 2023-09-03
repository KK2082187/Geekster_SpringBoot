package com.geekster.Ecommerce.Repository;

import com.geekster.Ecommerce.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepo {
    @Autowired
    Map<Integer,Product>products;
    public Map<Integer, Product> getProductList(){
        return products;
    }
}
