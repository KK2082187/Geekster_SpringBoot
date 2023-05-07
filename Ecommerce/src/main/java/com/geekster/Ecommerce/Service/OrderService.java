package com.geekster.Ecommerce.Service;

import com.geekster.Ecommerce.Model.Order;
import com.geekster.Ecommerce.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo orderRepo;
    public String saveOrder(Order order){
        return "Saved order";
    }
    public Order getOrder(Integer orderId){
        if(orderRepo.findById(orderId).isPresent())
            return orderRepo.findById(orderId).get();
        else
            return null;
    }
}
