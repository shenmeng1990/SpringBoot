package com.alibaba.service.impl;

import com.alibaba.dao.StudentDao;
import com.alibaba.model.Student;
import com.alibaba.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void saveStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
