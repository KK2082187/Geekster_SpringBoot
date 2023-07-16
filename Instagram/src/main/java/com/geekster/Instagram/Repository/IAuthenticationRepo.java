package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.AuthenticationToken;
import com.geekster.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<Integer, AuthenticationToken> {
AuthenticationToken findFirstByTokenValue(String authTokenValue);
AuthenticationToken findFirstByUser(User user);
}
