package com.alibaba.controller;

import com.alibaba.model.Student;
import com.alibaba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Controller
@RequestMapping("/test")
public class StuController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/index")
    public String indexHandle(){
        return "/index";
    }

    @PostMapping("/register")
    public String saveStudent(Student student, Model model){
        model.addAttribute("student",student);
        studentService.saveStudent(student);
        return "/html/welcome";
    }

    @GetMapping("/findById")
    public String findById(int id,Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student",student);
        return "/html/welcome";
    }

    @GetMapping("/count")
    @ResponseBody
    public Integer findNumber(){
        return  studentService.findNumber();
    }
}
