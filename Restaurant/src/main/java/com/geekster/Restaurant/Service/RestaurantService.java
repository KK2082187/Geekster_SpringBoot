package com.geekster.Restaurant.Service;

import com.geekster.Restaurant.Model.RestaurantModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    static List<RestaurantModel>restaurant = new ArrayList<RestaurantModel>();
    public List<RestaurantModel> add(RestaurantModel restaurantModel){
         restaurant.add(restaurantModel);
         return restaurant;
    }

    public  List<RestaurantModel> getRestaurant() {
        return restaurant;
    }

    public  List<RestaurantModel> getRestaurant(String name) {
        List<RestaurantModel>list = new ArrayList<>();
        for(RestaurantModel res:restaurant){
            if(res.getRestaurantName().equals(name)){
                list.add(res);
            }
        }
        for(RestaurantModel res:list){
            System.out.println(res);
        }
        return list;
    }
    public RestaurantModel update(RestaurantModel obj){
        for(RestaurantModel res:restaurant){
            if(res.getRestaurantName().equals(obj.getRestaurantName())){
                res.setRestaurantName(obj.getRestaurantName());
                res.setRestaurantAddress(obj.getRestaurantAddress());
                res.setRestaurantNumber(obj.getRestaurantNumber());
                res.setRestaurantSpecialty(obj.getRestaurantSpecialty());
                res.setRestaurantTotalStaff(obj.getRestaurantTotalStaff());
            }
        }
        return obj;
    }
    public RestaurantModel remove(RestaurantModel name){
        if(restaurant.contains(name))
            restaurant.remove(name);
        return name;
    }
}
