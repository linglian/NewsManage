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
@Table(name = "news")
public class News {
    private String title;
    private Time date;
    private int uniquekey;
    private String type;
    private String realType;
    private String autherName;
    private String thumbnailPic_S;
    private String thumbnailPic_S02;
    private String thumbnailPic_S03;
    private String pageContent;

    public News() {

    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Id
    public int getUniquekey() {
        return uniquekey;
    }

    public void setUniquekey(int uniquekey) {
        this.uniquekey = uniquekey;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "realtype")
    public String getRealType() {
        return realType;
    }

    public void setRealType(String realType) {
        this.realType = realType;
    }

    @Column(name = "auther_name")
    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    @Column(name = "date")
    public Time getDate() {
        return date;
    }

    public void setDate(Time date) {
        this.date = date;
    }

    public String getThumbnailPic_S() {
        return thumbnailPic_S;
    }

    public void setThumbnailPic_S(String thumbnailPic_S) {
        this.thumbnailPic_S = thumbnailPic_S;
    }

    public String getThumbnailPic_S02() {
        return thumbnailPic_S02;
    }

    public void setThumbnailPic_S02(String thumbnailPic_S02) {
        this.thumbnailPic_S02 = thumbnailPic_S02;
    }

    public String getThumbnailPic_S03() {
        return thumbnailPic_S03;
    }

    public void setThumbnailPic_S03(String thumbnailPic_S03) {
        this.thumbnailPic_S03 = thumbnailPic_S03;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", uniquekey=" + uniquekey +
                ", type='" + type + '\'' +
                ", realType='" + realType + '\'' +
                ", autherName='" + autherName + '\'' +
                ", thumbnailPic_S='" + thumbnailPic_S + '\'' +
                ", thumbnailPic_S02='" + thumbnailPic_S02 + '\'' +
                ", thumbnailPic_S03='" + thumbnailPic_S03 + '\'' +
                ", pageContent='" + pageContent + '\'' +
                '}';
    }
}
