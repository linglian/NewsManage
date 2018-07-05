package com.github.news.controll;

import com.github.news.model.User;
import com.github.news.service.UserService;
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
public class UserControll {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
    @ResponseBody
    boolean userAction(String action, User user, HttpServletRequest request) {
        System.out.println("---linglian.com---user值: " +
                user + "------UserControll_userAction_27");
        System.out.println("---linglian.com---action值: " +
                action + "------UserControll_userAction_29");
        if ("register".equals(action)) {
            if (user.getPassword() != null && user.getUserName() != null) {
                if (userService.existsByUserName(user.getUserName())) {
                    return false;
                } else {
                    userService.save(user);
                    return true;
                }
            }
        } else if ("login".equals(action)) {
            User u = userService.getByUserName(user.getUserName());
            if (u != null && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }


}
