package com.alibaba.config;

import com.alibaba.filter.IndexFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author shenmeng
 * @Date 2020/6/14
 **/
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<IndexFilter> getFilter(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new IndexFilter());
        registrationBean.addUrlPatterns("/index");
        return registrationBean;
    }

}
