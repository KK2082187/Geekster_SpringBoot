package com.geekster.Restaurant.Management.Service.Service;

import com.geekster.Restaurant.Management.Service.Model.Admin;
import com.geekster.Restaurant.Management.Service.Model.FoodItem;
import com.geekster.Restaurant.Management.Service.Repository.IAdminRepo;
import com.geekster.Restaurant.Management.Service.Repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    IAdminRepo iAdminRepo;



}
