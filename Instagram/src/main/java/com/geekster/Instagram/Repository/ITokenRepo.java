package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findByUser(User user);

    AuthenticationToken findByToken(String token);
}
