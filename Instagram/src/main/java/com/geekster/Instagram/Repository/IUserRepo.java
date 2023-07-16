package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Integer, User> {
    User findFirstByUserEmail(String newEmail);
}
