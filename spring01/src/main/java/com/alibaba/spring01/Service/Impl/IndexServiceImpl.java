package com.alibaba.spring01.Service.Impl;

import com.alibaba.spring01.Service.IndexService;
import org.springframework.stereotype.Service;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Service
public class IndexServiceImpl implements IndexService {
    @Override
    public void doSomeThing() {
        System.out.println("调用IndexServiceImpl.doSomeThing");
    }
}
