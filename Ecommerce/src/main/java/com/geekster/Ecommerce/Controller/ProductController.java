package com.geekster.Ecommerce.Controller;

import com.geekster.Ecommerce.Model.Product;
import com.geekster.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("addProduct")
    public String addProduct(@RequestBody List<Product>products){
        return productService.addProduct(products);
    }
    @GetMapping("product")
    public Map<Integer, Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @DeleteMapping("deleteProduct/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.deleteProduct(productId);
    }

}
