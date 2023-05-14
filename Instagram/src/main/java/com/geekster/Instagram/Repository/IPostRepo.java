package com.geekster.Instagram.Repository;

import com.geekster.Instagram.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
