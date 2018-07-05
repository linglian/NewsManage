package com.github.news.service;

import com.github.news.model.LoveNews;
import com.github.news.model.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
public interface NewsService extends JpaRepository<News, Integer> {
    List<News> findByType(String type);
    List<News> findByUniquekeyIn(List<Integer> list);
}
