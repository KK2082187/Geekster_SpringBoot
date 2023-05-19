package com.geekster.Instagram.Design.Repo;

import com.geekster.Instagram.Design.Model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByToken(String token);
}
