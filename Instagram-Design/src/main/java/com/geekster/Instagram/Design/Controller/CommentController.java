package com.geekster.Instagram.Design.Controller;

import com.geekster.Instagram.Design.Model.InstagramComment;
import com.geekster.Instagram.Design.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping()
    String addComment(@RequestBody InstagramComment comment)
    {
        return commentService.addComment(comment);
    }
}
