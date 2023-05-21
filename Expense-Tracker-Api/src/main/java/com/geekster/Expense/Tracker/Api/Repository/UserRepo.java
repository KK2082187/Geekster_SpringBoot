package com.geekster.Expense.Tracker.Api.Repository;

import com.geekster.Expense.Tracker.Api.Model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value = "select * from user where user_name= :userName and status_id=1",nativeQuery = true)
    List<User> findByUserName(String userName);

    @Query(value = "select * from tbl_user where user_name= :userName and password=:password and status_id=1",nativeQuery = true)
    List<User> findByUserNameAndPassword(String userName, String password);

    @Query(value = "select * from user where user_id= :userId and status_id=1",nativeQuery = true)
    User findByUserId(int userId);

    @Modifying
    @Transactional
    @Query(value = "update user set status_id=2 where user_id= :userId",
            countQuery="select count(*) from tbl_user",nativeQuery = true)
    void deleteUserById(int userId);

    @Query(value = "select * from user where user_id= :userId and status_id=1",nativeQuery = true)
    public List<User> findByUserId_(int userId);
}
