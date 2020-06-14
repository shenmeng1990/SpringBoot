package com.alibaba.service;

import com.alibaba.model.Student; /**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
public interface StudentService {

    void saveStudent(Student student);

    Student findById(int id);

    Integer findNumber();
}
