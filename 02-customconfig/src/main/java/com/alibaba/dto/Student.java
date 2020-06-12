package com.alibaba.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Component
@PropertySource(value="custom.properties",encoding ="utf-8")
@ConfigurationProperties("student")
@Data
public class Student {

    private String name;

    private Integer age;

    private Double score;
}
