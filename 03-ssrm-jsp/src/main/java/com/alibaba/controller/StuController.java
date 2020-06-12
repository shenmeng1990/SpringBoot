package com.alibaba.controller;

import com.alibaba.model.Student;
import com.alibaba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Controller
@RequestMapping("/test")
public class StuController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/register")
    public String index(Student student, Model model){
        model.addAttribute("student",student);
        studentService.saveStudent(student);
        return "welcome";
    }
}
