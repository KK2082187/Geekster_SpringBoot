package com.geekster.Instagram.Design.Repo;

import com.geekster.Instagram.Design.Model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeRepo extends JpaRepository<PostLike,Long> {
    long countByPost_PostId(Long postId);
}
