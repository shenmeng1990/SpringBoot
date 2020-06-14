package com.alibaba.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.model.Student;
import com.alibaba.service.StudentService;
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

    @Reference
    private StudentService studentService;

    @PostMapping("/register")
    public String index(Student student, Model model){
        model.addAttribute("student",student);
        studentService.saveStudent(student);
        return "welcome";
    }

    @GetMapping("/findById")
    @ResponseBody
    public Student findById(int id){
        return studentService.findById(id);
    }

    @GetMapping("/count")
    @ResponseBody
    public Integer findNumber(){
        return  studentService.findNumber();
    }
}
