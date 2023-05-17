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
@RequestMapping("admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @PostMapping(value = "foodItem")
    public String addAdmin(@RequestBody Admin admin){
        return adminService.add(admin);
    }


}
