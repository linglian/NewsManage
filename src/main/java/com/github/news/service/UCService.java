package com.github.news.service;

import com.github.news.model.LoveNews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
public interface UCService extends JpaRepository<LoveNews, Integer> {
    List<LoveNews> findByUserId(int userId);
    boolean existsByUserIdAndUniquekey(int userId, int uniquekey);
}
