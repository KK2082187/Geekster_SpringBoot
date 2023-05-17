package com.geekster.Restaurant.Management.Service.Repository;

import com.geekster.Restaurant.Management.Service.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order,Long> {
}
