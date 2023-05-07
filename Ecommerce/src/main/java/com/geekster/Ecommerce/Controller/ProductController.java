package com.geekster.Ecommerce.Controller;

import com.geekster.Ecommerce.Model.Product;
import com.geekster.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping(value = "/product")
    public String saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @GetMapping(value="/product/category")
    public List<Product>getProduct(@RequestParam String category){
        return productService.getProduct(category);
    }
    @GetMapping(value="/product")
    public List<Product>getAllProduct(){
        return productService.getAllproduct();
    }
    @DeleteMapping(value = "delete-by-id")
    public String deleteById(@RequestParam Integer productId){
        return productService.deleteById(productId);
    }
}
