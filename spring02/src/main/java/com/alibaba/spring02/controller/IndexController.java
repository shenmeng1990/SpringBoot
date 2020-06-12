package com.alibaba.spring02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shenmeng
 * @Date 2020-06-10
 **/
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "Hello SpringBoot!";
    }

}
