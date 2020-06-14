package com.alibaba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author shenmeng
 * @Date 2020/6/14
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("welcome","welcome to thymeleaf");
        return "index";
    }
}
