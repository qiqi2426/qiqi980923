package com.controller;

import com.domain.Menu;
import com.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.MenuService;
import com.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Mycontroller {

    @Resource(name = "menuServiceImpl")
    MenuService menuService;
    @Resource(name ="userServiceImpl")
    UserService userService;

    @RequestMapping("selectUserMenu")
    public ModelAndView SelectUserMenu(HttpSession session) throws JsonProcessingException {
        User user = (User) session.getAttribute("user");
        ModelAndView modelAndView=new ModelAndView();
        List<Menu> menus = userService.selectAllMenuByUser(user);
        ObjectMapper objectMapper=new ObjectMapper();
        String s = objectMapper.writeValueAsString(menus);
        s=s.replaceAll("\"pid\"","\"pId\"");
        modelAndView.addObject("menus",s);
        modelAndView.setViewName("main");
        return modelAndView;
    }
}
