package com.github.news.controll;

import com.github.news.model.LoveNews;
import com.github.news.model.News;
import com.github.news.service.NewsService;
import com.github.news.service.UCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
@Controller
public class UCControll {

    @Autowired
    UCService ucService;
    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/uc", produces = "application/json;charset=UTF-8")
    @ResponseBody
    List<News> newsAction(String action, LoveNews loveNews, HttpServletRequest request) {
        if ("getuc".equals(action)) {
            if (loveNews.getUserId() != 0) {
                List<LoveNews> tList = ucService.findByUserId(loveNews.getUserId());
                List<Integer> list = new LinkedList<>();
                for (LoveNews i : tList) {
                    list.add(i.getUniquekey());
                }
                return newsService.findByUniquekeyIn(list);
            }
        }
        return null;
    }

    @RequestMapping(value = "/ac_uc", produces = "application/json;charset=UTF-8")
    @ResponseBody
    boolean newsAction2(String action, LoveNews loveNews, HttpServletRequest request) {
        if ("uc".equals(action)) {
            if (ucService.existsByUserIdAndUniquekey(loveNews.getUserId(), loveNews.getUniquekey())) {
                return false;
            } else {
                ucService.save(loveNews);
                return true;
            }
        }
        return false;
    }
}
