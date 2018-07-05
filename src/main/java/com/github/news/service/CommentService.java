package com.github.news.service;

import com.github.news.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
public interface CommentService extends JpaRepository<Comment, Integer> {
    List<Comment> findByUserId(int userId);
    List<Comment> findByUniquekey(int uniquekey);
}
