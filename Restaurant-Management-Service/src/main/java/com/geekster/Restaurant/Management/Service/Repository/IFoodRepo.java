package com.geekster.Restaurant.Management.Service.Repository;

import com.geekster.Restaurant.Management.Service.Model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepo extends JpaRepository<FoodItem,Long> {
}
