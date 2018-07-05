package com.github.news.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
@Entity
@Table(name = "love_news")
public class LoveNews {
    private int userId;
    private int uniquekey;
    private int ucId;

    @Id
    public int getUcId() {
        return ucId;
    }

    public void setUcId(int ucId) {
        this.ucId = ucId;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(int uniquekey) {
        this.uniquekey = uniquekey;
    }

    @Override
    public String toString() {
        return "LoveNews{" +
                "userId=" + userId +
                ", uniquekey=" + uniquekey +
                ", ucId=" + ucId +
                '}';
    }
}
