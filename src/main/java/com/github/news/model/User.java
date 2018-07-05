package com.github.news.model;

import javax.persistence.*;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
@Entity
@Table(name = "user")
public class User {
    private String userName;

    private int userId;
    private String password;

    public User() {
    }

    @Column(name="username")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name="password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", password='" + password + '\'' +
                '}';
    }
}
