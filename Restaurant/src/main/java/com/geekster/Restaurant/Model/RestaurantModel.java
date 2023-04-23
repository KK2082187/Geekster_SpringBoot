package com.geekster.Restaurant.Model;

public class RestaurantModel {
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private String restaurantSpecialty;
    private String restaurantTotalStaff;
    public RestaurantModel(String restaurantName,String restaurantAddress,String restaurantNumber,String restaurantSpecialty,String restaurantTotalStaff){
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.restaurantSpecialty = restaurantSpecialty;
        this.restaurantTotalStaff = restaurantTotalStaff;
    }
    public String getRestaurantName(){
        return restaurantName;
    }
    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
    }
    public String getRestaurantAddress(){
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }
    public String getRestaurantNumber(){
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }
    public String getRestaurantSpecialty(){
        return restaurantSpecialty;
    }

    public void setRestaurantSpecialty(String restaurantSpecialty) {
        this.restaurantSpecialty = restaurantSpecialty;
    }
    public String getRestaurantTotalStaff(){
        return restaurantTotalStaff;
    }
    public void setRestaurantTotalStaff(String restaurantTotalStaff){
        this.restaurantTotalStaff = restaurantTotalStaff;
    }
}
