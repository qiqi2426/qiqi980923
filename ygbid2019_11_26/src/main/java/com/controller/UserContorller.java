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

    @RequestMapping("useryanzhen")
    public String Useryanzhen(User user, HttpSession session) throws JsonProcessingException {
        User user1 = userService.selectOneUser(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "redirect:/selectUserMenu";
        }

        return "redirect:userindex";
    }
    @RequestMapping("userindex")
    public String Userindex(){
        return "userindex";
    }
}
