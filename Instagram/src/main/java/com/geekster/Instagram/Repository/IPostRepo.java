package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Integer, Post> {
}
