package com.alibaba.controller;

import com.alibaba.Service.ISomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@RestController
public class IndexController {

    @Autowired
    private ISomeService iSomeService;

    @GetMapping("/index")
    public String index(){
        return iSomeService.send();
    }

}
