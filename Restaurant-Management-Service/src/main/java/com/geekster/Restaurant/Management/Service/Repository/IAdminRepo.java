package com.geekster.Restaurant.Management.Service.Repository;

import com.geekster.Restaurant.Management.Service.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin,Long> {

}
