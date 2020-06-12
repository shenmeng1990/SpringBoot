package com.alibaba.Service.Impl;

import com.alibaba.Service.ISomeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Service
@Profile("pro")
public class ProSomeService implements ISomeService {
    @Override
    public String send() {
        return "使用运营商服务发送短信！";
    }
}
