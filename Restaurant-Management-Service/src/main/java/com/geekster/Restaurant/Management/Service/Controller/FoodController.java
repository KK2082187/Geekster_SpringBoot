package com.geekster.Restaurant.Management.Service.Controller;

import com.geekster.Restaurant.Management.Service.Model.FoodItem;
import com.geekster.Restaurant.Management.Service.Service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FoodController {
    @Autowired
    FoodItemService foodItemService;
    @PostMapping(value = "food")
    public String addfood(@RequestBody FoodItem foodItem){
        return foodItemService.add(foodItem);
    }
    @GetMapping(value = "allfood")
    public List<FoodItem> getAll(){
        return foodItemService.getfood();
    }

}
