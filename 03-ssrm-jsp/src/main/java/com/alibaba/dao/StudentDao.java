package com.alibaba.dao;

import com.alibaba.model.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Mapper
public interface StudentDao {

    void insertStudent(Student student);

}
