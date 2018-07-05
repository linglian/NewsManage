package com.github.news.service;

import com.github.news.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */

public interface UserService extends JpaRepository<User, Integer> {
    List<User> findByUserName(String userName);
    boolean existsByUserName(String userName);
    User getByUserName(String userName);
}
