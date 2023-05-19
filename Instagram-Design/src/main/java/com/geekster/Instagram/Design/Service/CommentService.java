package com.geekster.Instagram.Design.Service;

import com.geekster.Instagram.Design.Model.InstagramComment;
import com.geekster.Instagram.Design.Repo.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    ICommentRepo commentRepo;


    public String addComment(InstagramComment comment) {
        InstagramComment rComment = commentRepo.save(comment);
        if(rComment == null)
        {
            return "Comment not saved...!";
        }
        else
        {
            return "Comment saved...!";
        }
    }
}
