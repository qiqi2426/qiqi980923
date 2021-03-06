package com.controller;

import com.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserContorller {

    @Resource(name ="userServiceImpl")
    UserService userService;

    /**
     * 后台管理登录验证
     * @param user
     * @param session
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("useryanzhen")
    public String userYanzhen(User user, HttpSession session) throws JsonProcessingException {
        User user1 = userService.selectOneUser(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "redirect:selectusermenu";
        }

        return "redirect:userindex";
    }
    //进去后台登录界面
    @RequestMapping("userindex")
    public String userindex(){
        return "userindex";
    }
}
