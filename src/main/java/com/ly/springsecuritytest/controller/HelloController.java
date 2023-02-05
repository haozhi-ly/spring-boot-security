package com.ly.springsecuritytest.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public  String index(String name,ModelMap modelMap, HttpSession session){
        modelMap.addAttribute("name",name);
        return "hello";
    }
}
