package com.geekster.Restaurant.Management.Service.Controller;

import com.geekster.Restaurant.Management.Service.Model.Admin;
import com.geekster.Restaurant.Management.Service.Model.FoodItem;
import com.geekster.Restaurant.Management.Service.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
 @Autowired
    AdminService adminService;
  @PostMapping("addItem")
    public String addFood(@RequestBody FoodItem foodItem){
      return addFood(foodItem);
  }

}
