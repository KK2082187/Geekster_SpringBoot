package com.geekster.Instagram.Design.Repo;

import com.geekster.Instagram.Design.Model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
@Repository
public interface ICommentRepo extends JpaRepository<InstagramComment,Long> {
}
