package com.geekster.Instagram.Design.Repo;

import com.geekster.Instagram.Design.Model.Post;
import com.geekster.Instagram.Design.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
    List<Post> findByUser(User user);
}
