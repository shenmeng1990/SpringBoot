package com.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shenmeng
 * @Date 2020/6/14
 **/
@RestController
public class IndexController {

    @GetMapping("/first/index")
    public String first(){
        System.out.println("first");
        return "first";
    }

    @GetMapping("/second/index")
    public String second(){
        System.out.println("second");
        return "second";
    }
}
