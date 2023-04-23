package com.geekster.Restaurant.Controller;

import com.geekster.Restaurant.Model.RestaurantModel;
import com.geekster.Restaurant.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping("/add-restaurant")
    public List<RestaurantModel> add(@RequestBody RestaurantModel restaurant){
        return restaurantService.add(restaurant);
    }
    @GetMapping("/getAllRestaurant")
    public List<RestaurantModel>getAll(){
        return restaurantService.getRestaurant();
    }
    @GetMapping("/getByName/{name}")
    public List<RestaurantModel> getByName(@PathVariable String name){
        return restaurantService.getRestaurant(name);
    }
    @PutMapping("/updateByName")
    public RestaurantModel update(@RequestBody RestaurantModel restaurant){
        return restaurantService.update(restaurant);
    }
    @DeleteMapping("/removeByName/{name}")
    public RestaurantModel remove(@PathVariable RestaurantModel name){
        return   restaurantService.remove(name);
    }
}
