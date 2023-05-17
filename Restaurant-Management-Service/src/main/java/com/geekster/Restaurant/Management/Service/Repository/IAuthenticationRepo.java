package com.geekster.Restaurant.Management.Service.Repository;

import com.geekster.Restaurant.Management.Service.Model.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<Authentication,Long> {
}
