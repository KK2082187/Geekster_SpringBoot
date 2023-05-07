package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Product;
import com.geekster.Ecommerce.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo;
    public String saveProduct(Product product){
        productRepo.save(product);
        return "Saved product";
    }
    public List<Product>getProduct(String category){
        List<Product>products;
        List<Product>categoryList=null;
        products = productRepo.findAll();
        for(Product pro:products){
            if(pro.equals(category)){
                categoryList.add(pro);
            }
        }
        if (categoryList.isEmpty())
            return products;
        else
            return categoryList;
    }
    public List<Product>getAllproduct(){
        return productRepo.findAll();
    }
    public String deleteById(Integer productId){
        Product product = productRepo.getById(productId);
        if(product != null){
            product = null;
            return "Deleted product";
        }else{
            return "Product not found";
        }
    }
}
