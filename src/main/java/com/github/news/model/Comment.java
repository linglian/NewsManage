package com.github.news.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
@Entity
@Table(name = "comments")
public class Comment {
    private int uniquekey;
    private int userId;
    private String userName;
    private String newsBody;
    private Time dateTime;
    private int commentId;

    public Comment() {
    }

    public int getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(int uniquekey) {
        this.uniquekey = uniquekey;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "userName")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNewsBody() {
        return newsBody;
    }

    public void setNewsBody(String newsBody) {
        this.newsBody = newsBody;
    }

    @Column(name = "datetime")
    public Time getDateTime() {
        return dateTime;
    }

    public void setDateTime(Time dateTime) {
        this.dateTime = dateTime;
    }

    @Id
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "uniquekey=" + uniquekey +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", newsBody='" + newsBody + '\'' +
                ", dateTime=" + dateTime +
                ", commentId=" + commentId +
                '}';
    }
}
