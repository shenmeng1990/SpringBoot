package com.alibaba.Service.Impl;

import com.alibaba.Service.ISomeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Service
@Profile("dev")
public class DevSomeService implements ISomeService {
    @Override
    public String send() {
        return "dev 环境模拟器发送短信！";
    }
}
