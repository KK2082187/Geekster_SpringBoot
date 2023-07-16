package com.geekster.Instagram.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String postData;


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
