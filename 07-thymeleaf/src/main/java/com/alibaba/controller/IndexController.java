package com.alibaba.controller;

import com.alibaba.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author shenmeng
 * @Date 2020/6/14
 **/
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("welcome","welcome to thymeleaf");
        model.addAttribute("student",new Student("张三",20));
        model.addAttribute("gender","male");
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("李四",25));
        studentList.add(new Student("王五",26));
        studentList.add(new Student("赵六",27));
        model.addAttribute("students",studentList);
        Map<String,Student> map = new HashMap<>();
        map.put("stu1",new Student("孙七",30));
        map.put("stu2",new Student("郑八",31));
        map.put("stu3",new Student("吴九",32));
        model.addAttribute("map",map);
        model.addAttribute("elementId","reddiv");
        model.addAttribute("bgColor","red");
        return "index";
    }
}
