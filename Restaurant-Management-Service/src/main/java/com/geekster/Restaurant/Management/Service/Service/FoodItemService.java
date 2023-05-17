package com.geekster.Restaurant.Management.Service.Service;

import com.geekster.Restaurant.Management.Service.Model.FoodItem;
import com.geekster.Restaurant.Management.Service.Repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodItemService {
    @Autowired
    IFoodRepo iFoodRepo;



    public String add(FoodItem foodItem) {
        iFoodRepo.save(foodItem);
        return "Added food";
    }

    public List<FoodItem> getfood() {
        return iFoodRepo.findAll();
    }


}
