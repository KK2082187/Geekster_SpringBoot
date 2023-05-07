package com.geekster.Ecommerce.Controller;

import com.geekster.Ecommerce.Model.Order;
import com.geekster.Ecommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping(value = "/order")
    public String save(@RequestBody Order order){
        return orderService.saveOrder(order);
    }
    @GetMapping(value = "/get-order")
    public Order getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }
}
