package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Product;
import com.geekster.Ecommerce.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {
     @Autowired
    ProductRepo productRepo;
    public Map<Integer, Product> getAllProduct() {
        return productRepo.getProductList();
    }

    public String addProduct(List<Product> products) {
        Map<Integer,Product>productList = getAllProduct();
        for(Product product:products){
            productList.put(product.getProductId(),product);
        }
        return "Product Added";
    }

    public String deleteProduct(Integer productId) {
        Map<Integer,Product>productMap = getAllProduct();
       Product product = productMap.get(productId);
       if(product != null){
           productMap.remove(productId);
           return productId + "removed";
       }else{
           return productId + "not found";
       }
    }
}
