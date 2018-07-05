package com.github.news.controll;

import com.github.news.model.Comment;
import com.github.news.model.News;
import com.github.news.service.CommentService;
import com.github.news.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CommentsControll {

    @Autowired
    CommentService commentService;

    @RequestMapping(value = "/comment", produces = "application/json;charset=UTF-8")
    @ResponseBody
    List<Comment> newsAction(String action, Comment com, HttpServletRequest request) {
        if ("getcomments".equals(action)) {
            return commentService.findByUniquekey(com.getUniquekey());
        } else if ("getusercomments".equals(action)) {
            return commentService.findByUserId(com.getUserId());
        }
        return null;
    }

    @RequestMapping(value = "/pushComment", produces = "application/json;charset=UTF-8")
    @ResponseBody
    Comment newsAction2(String action, Comment com, HttpServletRequest request) {
        if("comment".equals(action)) {
            if (com.getUserId() != 0 && com.getUniquekey() != 0 && com.getNewsBody() != null) {
                commentService.save(com);
                return com;
            }
        }
        return null;
    }
}
