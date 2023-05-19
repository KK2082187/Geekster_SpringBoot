package com.geekster.Instagram.Design.Repo;

import com.geekster.Instagram.Design.Model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFollowerRepo extends JpaRepository<InstagramFollower,Long> {
}
