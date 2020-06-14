package com.alibaba.config;

import com.alibaba.servlet.IndexServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author shenmeng
 * @Date 2020/6/14
 **/
@Configuration
public class ServletConfig {

    @Bean
    public ServletRegistrationBean<IndexServlet> getServlet(){
        return new ServletRegistrationBean<>(new IndexServlet(),"/index");
    }
}
