package com.geekster.Restaurant.Management.Service.Repository;

import com.geekster.Restaurant.Management.Service.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String email);
}
