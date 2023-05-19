package com.geekster.Instagram.Design.Repo;

import com.geekster.Instagram.Design.Model.InstagramFollowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFollowingRepo extends JpaRepository<InstagramFollowing,Long> {

}
