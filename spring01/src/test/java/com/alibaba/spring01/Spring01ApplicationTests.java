package com.alibaba.spring01;

import com.alibaba.spring01.Service.IndexService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring01ApplicationTests {

    @Autowired
    private IndexService indexService;

    @Test
    void contextLoads() {
        indexService.doSomeThing();
    }

}
