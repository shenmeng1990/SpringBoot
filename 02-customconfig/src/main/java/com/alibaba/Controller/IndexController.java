package com.alibaba.Controller;

import com.alibaba.dto.Country;
import com.alibaba.dto.School;
import com.alibaba.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@RestController
@PropertySource(value="custom.properties",encoding = "UTF-8")
public class IndexController {

    @Value("${server.port}")
    private Integer port;

    @Value("${student.name}")
    private String name;

    @Autowired
    private Student student;

    @Autowired
    private Country country;

    @Autowired
    private School school;

    @GetMapping("/port")
    public String portHandle(){
        return "配置端口号为："+port;
    }

    @GetMapping("/name")
    public String nameHandle(){
        return name;
    }

    @GetMapping("/stu")
    public Object stuHandle(){
        return student;
    }

    @GetMapping("/country")
    public Object countryHandle(){
        return country;
    }

    @GetMapping("/school")
    public Object schoolHandle(){
        return school;
    }

}
