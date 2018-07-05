package com.github.news.controll;

import com.github.news.model.News;
import com.github.news.model.User;
import com.github.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Description:
 * Author: linglian
 * Time: 2018/7/5
 */
@Controller
public class NewsControll {

    @Autowired
    NewsService newsService;

    @RequestMapping(value = "/news", produces = "application/json;charset=UTF-8")
    @ResponseBody
    List<News> newsAction(String action, int count, News news, HttpServletRequest request) {
        if ("getnews".equals(action)) {
            List<News> list = newsService.findByType(news.getType());
            System.out.println("---linglian.com---list值: " +
                    list + "------NewsControll_newsAction_33");
            if (count > list.size()) {
                return list.subList(0, list.size());
            } else {
                return list.subList(0, count);
            }
        }
        return null;
    }

    @RequestMapping(value = "/newsOfOne", produces = "application/json;charset=UTF-8")
    @ResponseBody
    News newsActionOfOne(String action, News news, HttpServletRequest request) {
        if ("getnewsitem".equals(action)) {
            return newsService.findById(news.getUniquekey()).get();
        }
        return null;
    }
}
